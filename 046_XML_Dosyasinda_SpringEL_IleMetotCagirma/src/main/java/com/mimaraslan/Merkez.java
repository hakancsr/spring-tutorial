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

		System.out.println("YAZAR :" + yazar.getAdi() + " " + yazar.getSoyadi());
		System.out.println("KİTAP :" + yazar.getKitapAdi());
		System.out.println("ISBN  :" + yazar.getKitap().getEserISBN());

		System.out.println(yazar.getBilgi());

		((ConfigurableApplicationContext) context).close();
	}

}
