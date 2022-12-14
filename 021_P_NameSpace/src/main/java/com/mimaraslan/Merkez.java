package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");

		System.out.println("ADI         : " + ogrenci.getAdi());
		System.out.println("SOYADI      : " + ogrenci.getSoyadi());
		System.out.println("NUMARASI    : " + ogrenci.getNumarasi());
		System.out.println("√úniveritesi : " + ogrenci.getUniversitesi().getKurumAdi());
	}

}
