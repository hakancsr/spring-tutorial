package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		B b = (B) context.getBean("beanB");

		b.sonucuGoster();

		@SuppressWarnings("unused")
		C c = (C) context.getBean("beanC");
	}
}
