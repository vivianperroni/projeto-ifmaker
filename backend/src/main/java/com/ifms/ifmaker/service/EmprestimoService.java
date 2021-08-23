package com.ifms.ifmaker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.ifmaker.dto.EmprestimoDTO;
import com.ifms.ifmaker.entities.Emprestimo;
import com.ifms.ifmaker.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository repository;
	
	public List<EmprestimoDTO> findAll(){
		List<Emprestimo> result = repository.findAll();
		return result.stream().map(x -> new EmprestimoDTO(x)).collect(Collectors.toList());
	}
}
