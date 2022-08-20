package com.mimaraslan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ders {

	@Autowired
	@Qualifier("OgrenciBean2")
	private Ogrenci ogrenci;
	
	/*
	@Autowired
	public Ders(Ogrenci ogrenci) {
		this.ogrenci=ogrenci;
	}
	/*
	 */
	private int puan;
	
	public Ogrenci getOgrenci() {
		return ogrenci;
	}
	
	//@Autowired
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getDers() {
		return ders;
	}
	public void setDers(String ders) {
		this.ders = ders;
	}
	private String ders;
}
