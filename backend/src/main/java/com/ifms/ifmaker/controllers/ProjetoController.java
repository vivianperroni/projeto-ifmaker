package com.ifms.ifmaker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.ifmaker.dto.ProjetoDTO;
import com.ifms.ifmaker.service.ProjetoService;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoService service;
	
	public ResponseEntity<List<ProjetoDTO>> findAll(){
		List<ProjetoDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
