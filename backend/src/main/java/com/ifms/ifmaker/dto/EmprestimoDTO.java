package com.ifms.ifmaker.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;

import com.ifms.ifmaker.entities.Emprestimo;
import com.ifms.ifmaker.entities.Material;

public class EmprestimoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Time horario;
	@FutureOrPresent(message = "Não é possível cadastrar no passado!")
	private Date data;
	@NotBlank(message = "O campo Material é obrigatório")
	private Material material;
	
	public EmprestimoDTO() {
	}

	public EmprestimoDTO(Long id, Time horario, Date data, Material material) {
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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	
}
