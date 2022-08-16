package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Calisan calisan = context.getBean("beanCalisan", Calisan.class);

		System.out.println("ADI     : " + calisan.getAdi());
		System.out.println("SOYADI  : " + calisan.getSoyadi());
		System.out.println("YAŞI    : " + calisan.getYasi());
		System.out.println("ŞEHİR   : " + calisan.adres.getSehir());
		System.out.println("SEMT    : " + calisan.getAdres().getSemt());
		System.out.println("MAHALLE : " + calisan.getAdres().getMahalle());
		System.out.println("CADDE   : " + calisan.getAdres().getCadde());
		System.out.println("KAPI NO : " + calisan.getAdres().getNo());
		System.out.println("DAİRE   : " + calisan.getAdres().getDaire());
	}

}
