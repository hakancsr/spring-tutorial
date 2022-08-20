package com.mimaraslan;

public class Kitap {

	private long eserISBN;
	private String eserAdi;

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	public String kitapBilgisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {
		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;

		return "\n\tYAZAR : " + yazarAdi + " " + yazarSoyadi + "\n\tKİTAP : " + getEserAdi() + "\n\tISBN : "
				+ getEserISBN() + "\n";
	}
}
