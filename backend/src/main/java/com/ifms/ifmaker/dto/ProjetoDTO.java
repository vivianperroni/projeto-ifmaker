package com.ifms.ifmaker.dto;

import java.io.Serializable;

import com.ifms.ifmaker.entities.Projeto;

public class ProjetoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String titulo;
	private String descricao;
	private String integrante;
	private String coordenador;
	private String material;
	
	public ProjetoDTO() {
	}

	public ProjetoDTO(Long id, String titulo, String descricao, String integrante, String coordenador,
			String material) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.integrante = integrante;
		this.coordenador = coordenador;
		this.material = material;
	}
	
	public ProjetoDTO(Projeto entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		descricao = entity.getDescricao();
		integrante = entity.getIntegrante();
		coordenador = entity.getCoordenador();
		material = entity.getMaterial();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIntegrante() {
		return integrante;
	}

	public void setIntegrante(String integrante) {
		this.integrante = integrante;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
