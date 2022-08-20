package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Ogrenci ogrenci = context.getBean("OgrenciBean", Ogrenci.class);

		System.out.println("ADI    : " + ogrenci.getAdi());
		System.out.println("SOYADI : " + ogrenci.getSoyadi());
		System.out.println("YAŞI   : " + ogrenci.getYasi());

		((ConfigurableApplicationContext) context).close();
	}
}
