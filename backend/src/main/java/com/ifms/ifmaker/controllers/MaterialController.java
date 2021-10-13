package com.ifms.ifmaker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.ifmaker.dto.MaterialDTO;
import com.ifms.ifmaker.service.MaterialService;

@RestController
@RequestMapping(value = "/materiais")
public class MaterialController {

	@Autowired
	private MaterialService service;
	
	@GetMapping
	public ResponseEntity<List<MaterialDTO>> findAll(){
		List<MaterialDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MaterialDTO> findById(@PathVariable Long id){
		MaterialDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
