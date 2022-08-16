package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Calisan calisan = context.getBean(Calisan.class);
		System.out.println(calisan.getAdres());

		((ConfigurableApplicationContext) context).close();
	}
}
