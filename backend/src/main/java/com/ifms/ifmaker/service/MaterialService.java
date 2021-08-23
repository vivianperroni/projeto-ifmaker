package com.ifms.ifmaker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifms.ifmaker.dto.MaterialDTO;
import com.ifms.ifmaker.entities.Material;
import com.ifms.ifmaker.repositories.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository repository;
	
	public List<MaterialDTO> findAll(){
		List<Material> result = repository.findAll();
		return result.stream().map(x -> new MaterialDTO(x)).collect(Collectors.toList());
	}
}
