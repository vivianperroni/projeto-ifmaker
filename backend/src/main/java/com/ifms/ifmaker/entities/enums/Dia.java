package com.ifms.ifmaker.entities.enums;

public enum Dia {
	SEGUNDA(1, "Segunda-feira"), 
	TERCA(2, "Terça-feira"), 
	QUARTA(3, "Quarta-feira"), 
	QUINTA(4, "Quinta-feira"), 
	SEXTA(5, "Sexta-feira");
	
	private int id;
	private String dia;
	
	Dia(int id, String dia) {
		this.id = id;
		this.dia = dia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	
}
