package com.mimaraslan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfig {

	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Malatya");
		sehir.setPlakaNo(44);
		return sehir;
	}

	@Bean
	public Ogrenci getOgrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}
}
