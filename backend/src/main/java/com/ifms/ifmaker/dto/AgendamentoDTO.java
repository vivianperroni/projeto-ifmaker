package com.ifms.ifmaker.dto;

import java.io.Serializable;

import com.ifms.ifmaker.entities.Agendamento;

public class AgendamentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String horario;
	private String data;
	private String material;
	
	public AgendamentoDTO() {
	}
	
	public AgendamentoDTO(Long id, String horario, String data, String material) {
		this.id = id;
		this.horario = horario;
		this.data = data;
		this.material = material;
	}

	public AgendamentoDTO(Agendamento entity) {
		id = entity.getId();
		horario = entity.getHorario();
		data = entity.getData();
		material = entity.getMaterial();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	
}
