package com.mimaraslan;

import javax.annotation.Resource;

public class Calisan {

	@Resource(name="sehirBean")
	private Sehir sehir;

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
}
