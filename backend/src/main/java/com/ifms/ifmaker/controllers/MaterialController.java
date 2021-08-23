package com.ifms.ifmaker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
		return ResponseEntity.ok(list);
	}
}
