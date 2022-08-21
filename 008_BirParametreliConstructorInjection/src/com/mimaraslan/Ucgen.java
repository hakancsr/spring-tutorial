package com.mimaraslan;

public class Ucgen {

	public Ucgen(String cesit) {
		this.cesit = cesit;
	}

	private String cesit;

	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	public void ciz() {
		System.out.println(getCesit() + " Üçgen çiz");
	}
}
