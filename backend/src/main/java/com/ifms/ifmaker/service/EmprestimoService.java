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
import org.springframework.web.client.ResourceAccessException;

import com.ifms.ifmaker.dto.EmprestimoDTO;
import com.ifms.ifmaker.entities.Emprestimo;
import com.ifms.ifmaker.repositories.EmprestimoRepository;
import com.ifms.ifmaker.service.exceptions.DataBaseException;
import com.ifms.ifmaker.service.exceptions.ResourceNotFoundException;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository repository;
		
	@Transactional(readOnly = true)
	public List<EmprestimoDTO> findAll(){
		List<Emprestimo> list = repository.findAll();
		return list.stream().map(entity -> new EmprestimoDTO(entity))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public EmprestimoDTO findById(Long id){
		Optional<Emprestimo> obj = repository.findById(id);
		Emprestimo emprestimo = obj.orElseThrow(() -> new ResourceAccessException("O emprestimo solicitado não doi localizado!"));
		return new EmprestimoDTO(emprestimo);
	}
	
	@Transactional
	public EmprestimoDTO insert(EmprestimoDTO dto) {
		Emprestimo emprestimo = new Emprestimo();
		copyDtoToEntity(dto, emprestimo);
		emprestimo = repository.save(emprestimo);
		return new EmprestimoDTO(emprestimo);
	}
	
	@Transactional
	public EmprestimoDTO update(Long id, EmprestimoDTO dto) {
		try {
			Emprestimo emprestimo = repository.getById(id);
			copyDtoToEntity(dto, emprestimo);
			emprestimo = repository.save(emprestimo);
			return new EmprestimoDTO(emprestimo);	
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("O id do Emprestimo não foi localizado!");
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Não foi possível excluir o id do Emprestimo");
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Não foi possível excluir o Emprestimo, pois o mesmo está em uso");
		}
	}
	
	private void copyDtoToEntity(EmprestimoDTO dto, Emprestimo emprestimo) {
		emprestimo.setHorario(dto.getHorario());
		emprestimo.setData(dto.getData());
		emprestimo.setMaterial(dto.getMaterial());
	}
}
