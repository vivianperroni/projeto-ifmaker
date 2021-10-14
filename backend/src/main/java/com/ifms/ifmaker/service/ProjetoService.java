package com.ifms.ifmaker.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.ifmaker.dto.ProjetoDTO;
import com.ifms.ifmaker.entities.Projeto;
import com.ifms.ifmaker.repositories.ProjetoRepository;
import com.ifms.ifmaker.service.exceptions.DataBaseException;
import com.ifms.ifmaker.service.exceptions.ResourceNotFoundException;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProjetoDTO> findAll(){
		List<Projeto> list = repository.findAll();
		return list.stream().map(entity -> new ProjetoDTO(entity))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ProjetoDTO findById(Long id){
		Optional<Projeto> obj = repository.findById(id);
		Projeto projeto = obj.orElseThrow(() -> new ResourceNotFoundException("O Id do Projeto solicitado não foi localizado!"));
		return new ProjetoDTO(projeto);
	}

	@Transactional
	public ProjetoDTO insert(ProjetoDTO dto) {
		Projeto projeto = new Projeto();
		copyDtoToEntity(dto, projeto);
		projeto = repository.save(projeto);
		return new ProjetoDTO(projeto);
	}
	
	@Transactional
	public ProjetoDTO update(Long id, ProjetoDTO dto) {
		try {
			Projeto projeto = repository.getById(id);
			copyDtoToEntity(dto, projeto);
			projeto = repository.save(projeto);
			return new ProjetoDTO(projeto);	
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Não é possível a atualização, pois o Id do Projeto não foi localizado!");
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Não foi possível excluir o Id do Projeto, pois o mesmo não foi localizado!");
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Não foi possível excluir o Id do Projeto, pois o mesmo está em uso!");
		}
	}
	
	private void copyDtoToEntity(ProjetoDTO dto, Projeto projeto) {
		projeto.setTitulo(dto.getTitulo());
		projeto.setDescricao(dto.getDescricao());
		projeto.setIntegrante(dto.getIntegrante());
		projeto.setCoordenador(dto.getCoordenador());
		projeto.setMaterial(dto.getMaterial());
	}
}
