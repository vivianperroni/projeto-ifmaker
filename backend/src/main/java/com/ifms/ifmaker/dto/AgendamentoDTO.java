package com.ifms.ifmaker.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import com.ifms.ifmaker.entities.Agendamento;
import com.ifms.ifmaker.entities.enums.Dia;

public class AgendamentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Time horario;
	private Date data;
	private String material;
	private Dia diaAgenda;
	
	public AgendamentoDTO() {
	}
	
	public AgendamentoDTO(Long id, Time horario, Date data, String material, Dia diaAgenda) {
		this.id = id;
		this.horario = horario;
		this.data = data;
		this.material = material;
		this.diaAgenda = diaAgenda;
	}

	public AgendamentoDTO(Agendamento entity) {
		id = entity.getId();
		horario = entity.getHorario();
		data = entity.getData();
		material = entity.getMaterial();
		diaAgenda = entity.getDiaAgenda();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Dia getDiaAgenda() {
		return diaAgenda;
	}

	public void setDiaAgenda(Dia diaAgenda) {
		this.diaAgenda = diaAgenda;
	}

	
}
