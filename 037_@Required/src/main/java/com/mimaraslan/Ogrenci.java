package com.mimaraslan;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Ogrenci {

	private String yasi;
	private String adi,soyadi;
	
	public String getYasi() {
		return yasi;
	}
	
	@Required
	public void setYasi(String yasi) {
		this.yasi = yasi;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
}
