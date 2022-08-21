package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SelamApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Selam nesne1 = (Selam) context.getBean("selam");
		nesne1.setMesaj("Güzel gören, güzel düşünür. Güzel düşünen, hayatından lezzet alır.");
		nesne1.goster();

		Selam nesne2 = (Selam) context.getBean("selam");
		nesne2.getMesaj();
		nesne2.goster();
	}
}
