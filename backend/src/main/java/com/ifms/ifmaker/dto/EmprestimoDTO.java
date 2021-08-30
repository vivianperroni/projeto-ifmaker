package com.ifms.ifmaker.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import com.ifms.ifmaker.entities.Emprestimo;

public class EmprestimoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Time horario;
	private Date data;
	private String material;
	
	public EmprestimoDTO() {
	}

	public EmprestimoDTO(Long id, Time horario, Date data, String material) {
		this.id = id;
		this.horario = horario;
		this.data = data;
		this.material = material;
	}

	public EmprestimoDTO(Emprestimo entity) {
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

	
}
