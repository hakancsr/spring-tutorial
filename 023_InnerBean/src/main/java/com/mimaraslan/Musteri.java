package com.mimaraslan;

public class Musteri {

	private Siparis siparis;

	public Musteri() {
		System.out.println("Müşteri sınıfının yapılandırıcısı.");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}

	public void hesabiOde() {
		System.out.println("Müşteri sınıfındaki hesabı öde metodu.");
		siparis.toplamSonucuAl();
	}
}
