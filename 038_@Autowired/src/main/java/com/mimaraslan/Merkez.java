package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Ders ders = context.getBean("DersBean", Ders.class);

		System.out.println("ADI    :" + ders.getOgrenci().getAdi());
		System.out.println("SOYADI :" + ders.getOgrenci().getSoyadi().toString());
		System.out.println("YAŞI   :" + ders.getOgrenci().getYasi().toString());

		System.out.println("DERS   :" + ders.getDers());
		System.out.println("PUAN   :" + ders.getPuan());

		((ConfigurableApplicationContext) context).close();
	}
}
