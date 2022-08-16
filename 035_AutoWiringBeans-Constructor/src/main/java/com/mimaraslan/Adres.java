package com.mimaraslan;

public class Adres {

	public String tamAdres;

	public String getTamAdres() {
		return tamAdres;
	}

	public void setTamAdres(String tamAdres) {
		this.tamAdres = tamAdres;
	}

	@Override
	public String toString() {
		return "TAM ADRESİ : " + getTamAdres().toUpperCase().toString();
	}
}
