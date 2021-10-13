package com.ifms.ifmaker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.ifmaker.dto.EmprestimoDTO;
import com.ifms.ifmaker.service.EmprestimoService;

@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoController {

	@Autowired
	private EmprestimoService service;
	
	@GetMapping
	public ResponseEntity<List<EmprestimoDTO>> findAll(){
		List<EmprestimoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EmprestimoDTO> findById(@PathVariable Long id){
		EmprestimoDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
