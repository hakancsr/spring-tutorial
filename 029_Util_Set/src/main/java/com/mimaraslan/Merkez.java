package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Personel personel = context.getBean("BeanPersonel", Personel.class);
		System.out.println(personel);

		((ConfigurableApplicationContext) context).close();
	}
}
