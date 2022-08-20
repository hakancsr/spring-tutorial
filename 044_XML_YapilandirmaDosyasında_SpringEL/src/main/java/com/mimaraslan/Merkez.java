package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Yazar yazar = context.getBean("yazarBean", Yazar.class);

		System.out.println("YAZAR : " + yazar.getAdi() + " " + yazar.getSoyadi() + "\nKİTAP : " + yazar.getKitapAdi()
				+ "\nISBN : " + yazar.getKitap().getEserISBN());

		((ConfigurableApplicationContext) context).close();
	}
}
