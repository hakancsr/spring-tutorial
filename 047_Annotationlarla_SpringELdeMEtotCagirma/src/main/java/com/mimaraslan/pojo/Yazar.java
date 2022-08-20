package com.mimaraslan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazarBean")
public class Yazar {

	@Value("Mimar")
	private String adi;
	
	@Value("Aslan")
	private String soyadi;
	
	@Value("#{kitapBean.eserAdi}")
	private String kitapAdi;
	
	@Value("#{kitapBean}")
	private Kitap kitap;
	
	@Value("#{kitapBean.kitapBilgisiniAl('MİMAR','ASLAN','Hibernate','107115171923')}")
	private String bilgi;
	
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
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	public String getBilgi() {
		return bilgi;
	}
	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
}
