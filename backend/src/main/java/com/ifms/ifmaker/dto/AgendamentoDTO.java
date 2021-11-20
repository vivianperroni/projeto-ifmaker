package com.ifms.ifmaker.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;

import com.ifms.ifmaker.entities.Agendamento;
import com.ifms.ifmaker.entities.Projeto;
import com.ifms.ifmaker.entities.enums.Dia;

public class AgendamentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Time horario;
	@FutureOrPresent(message = "Não é possível cadastrar no passado!")
	private Date data;
	@NotBlank(message = "O campo Material é obrigatório")
	private String material;
	private Dia diaAgenda;
	private Projeto projeto;
	
	public AgendamentoDTO() {
	}
	
	public AgendamentoDTO(Long id, Time horario, Date data, String material, Dia diaAgenda, Projeto projeto) {
		this.id = id;
		this.horario = horario;
		this.data = data;
		this.material = material;
		this.diaAgenda = diaAgenda;
		this.projeto = projeto;
	}

	public AgendamentoDTO(Agendamento entity) {
		id = entity.getId();
		horario = entity.getHorario();
		data = entity.getData();
		material = entity.getMaterial();
		diaAgenda = entity.getDiaAgenda();
		projeto = entity.getProjeto();
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

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
}
