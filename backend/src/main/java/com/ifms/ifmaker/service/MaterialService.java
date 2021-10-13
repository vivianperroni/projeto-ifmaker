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

import com.ifms.ifmaker.dto.MaterialDTO;
import com.ifms.ifmaker.entities.Material;
import com.ifms.ifmaker.repositories.MaterialRepository;
import com.ifms.ifmaker.service.exceptions.DataBaseException;
import com.ifms.ifmaker.service.exceptions.ResourceNotFoundException;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository repository;
	
	@Transactional(readOnly = true)	
	public List<MaterialDTO> findAll(){
		List<Material> list = repository.findAll();
		return list.stream().map(entity -> new MaterialDTO(entity))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public MaterialDTO findById(Long id){
		Optional<Material> obj = repository.findById(id);
		Material material = obj.orElseThrow(() -> new ResourceAccessException("O material solicitado não doi localizado!"));
		return new MaterialDTO(material);
	}
	
	@Transactional
	public MaterialDTO insert(MaterialDTO dto) {
		Material material = new Material();
		copyDtoToEntity(dto, material);
		material = repository.save(material);
		return new MaterialDTO(material);
	}
	
	@Transactional
	public MaterialDTO update(Long id, MaterialDTO dto) {
		try {
			Material material = repository.getById(id);
			copyDtoToEntity(dto, material);
			material = repository.save(material);
			return new MaterialDTO(material);	
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("O id do Agendamento não foi localizado!");
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Não foi possível excluir o id do agendamento");
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Não foi possível excluir o Agendamento, pois o mesmo está em uso");
		}
	}
	
	private void copyDtoToEntity(MaterialDTO dto, Material material) {
		material.setTitulo(dto.getTitulo());
		material.setDescricao(dto.getDescricao());
	}
}
