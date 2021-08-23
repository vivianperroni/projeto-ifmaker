package com.ifms.ifmaker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.ifmaker.dto.AgendamentoDTO;
import com.ifms.ifmaker.service.AgendamentoService;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentoController {

	@Autowired
	private AgendamentoService service;
	
	@GetMapping
	public ResponseEntity<List<AgendamentoDTO>> findAll(){
		List<AgendamentoDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
