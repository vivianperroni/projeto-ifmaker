package com.ifms.ifmaker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.ifmaker.dto.AgendamentoDTO;
import com.ifms.ifmaker.entities.Agendamento;
import com.ifms.ifmaker.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository repository;
	
	public List<AgendamentoDTO> findAll(){
		List<Agendamento> result = repository.findAll();
		return result.stream().map(x -> new AgendamentoDTO(x)).collect(Collectors.toList());
	}
}
