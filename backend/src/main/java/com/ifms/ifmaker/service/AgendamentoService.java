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

import com.ifms.ifmaker.dto.AgendamentoDTO;
import com.ifms.ifmaker.entities.Agendamento;
import com.ifms.ifmaker.repositories.AgendamentoRepository;
import com.ifms.ifmaker.service.exceptions.DataBaseException;
import com.ifms.ifmaker.service.exceptions.ResourceNotFoundException;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository repository;
	
	@Transactional(readOnly = true)
	public List<AgendamentoDTO> findAll(){
		List<Agendamento> list = repository.findAll();
		return list.stream().map(entity -> new AgendamentoDTO(entity))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public AgendamentoDTO findById(Long id){
		Optional<Agendamento> obj = repository.findById(id);
		Agendamento agendamento = obj.orElseThrow(() -> new ResourceNotFoundException("O Id do Agendamento solicitado não foi localizado!"));
		return new AgendamentoDTO(agendamento);
	}
	
	@Transactional
	public AgendamentoDTO insert(AgendamentoDTO dto) {
		Agendamento agendamento = new Agendamento();
		copyDtoToEntity(dto, agendamento);
		agendamento = repository.save(agendamento);
		return new AgendamentoDTO(agendamento);
	}
	
	@Transactional
	public AgendamentoDTO update(Long id, AgendamentoDTO dto) {
		try {
			Agendamento agendamento = repository.getById(id);
			copyDtoToEntity(dto, agendamento);
			agendamento = repository.save(agendamento);
			return new AgendamentoDTO(agendamento);	
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Não é possível a atualização, pois o Id do Agendamento não foi localizado!");
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Não foi possível excluir o Id do Agendamento, pois o mesmo não foi localizado!");
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Não foi possível excluir o Id do Agendamento, pois o mesmo está em uso!");
		}
	}
	
	private void copyDtoToEntity(AgendamentoDTO dto, Agendamento agendamento) {
		agendamento.setHorario(dto.getHorario());
		agendamento.setData(dto.getData());
		agendamento.setMaterial(dto.getMaterial());
		agendamento.setDiaAgenda(dto.getDiaAgenda());
	}
	
}
