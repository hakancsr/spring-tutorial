package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Koleksiyonlar koleksiyonlar = context.getBean("BeanKoleksiyonlar",Koleksiyonlar.class);
		
		System.out.println(koleksiyonlar);
		
		((ConfigurableApplicationContext)context).close();
	}
}
