package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		PersonelServis personelServis = context.getBean("personelServisBean", PersonelServis.class);

		try {
			personelServis.adiSoyadiKontrolEt();
		} catch (Exception e) {
			System.out.println("Personel Servisinin adiSoyadiKontrolEt() metodunda istisna oluştu.");
			System.out.println("İstisna mesajı : " + e);
		}

		personelServis.selamVer(" Hoşgeldiniz.");
		personelServis.personelBilgisiniVer();

		context.close();

	}
}
