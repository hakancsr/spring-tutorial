package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.model.TernaryOperator;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		TernaryOperator ternaryOperator = context.getBean("ternaryOperatorBean", TernaryOperator.class);

		System.out.println(ternaryOperator);

		System.out.println("Sonuç : " + ternaryOperator.isKontrol());

		((ConfigurableApplicationContext) context).close();
	}
}
