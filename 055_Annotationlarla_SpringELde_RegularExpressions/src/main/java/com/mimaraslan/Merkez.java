package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.model.Listeler;
import com.mimaraslan.model.RegExKontrol;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Listeler list = context.getBean("listelerBean", Listeler.class);

		System.out.println(list);

		RegExKontrol regExKontrol = context.getBean("regExKontrolBean", RegExKontrol.class);

		System.out.println(regExKontrol);

		context.close();
	}
}
