package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Ogrenci ogrenci = context.getBean("beanOgrenci", Ogrenci.class);

		ogrenci.getOgrenciList();
		ogrenci.getOgrenciSet();
		ogrenci.getOgrenciMap();
		ogrenci.getOgrenciProp();
		
		((ConfigurableApplicationContext)context).close();
	}
}
