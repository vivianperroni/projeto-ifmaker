package com.ifms.ifmaker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.ifmaker.dto.ProjetoDTO;
import com.ifms.ifmaker.entities.Projeto;
import com.ifms.ifmaker.repositories.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository repository;
	
	public List<ProjetoDTO> findAll(){
		List<Projeto> result = repository.findAll();
		return result.stream().map(x -> new ProjetoDTO(x)).collect(Collectors.toList());
	}
}
