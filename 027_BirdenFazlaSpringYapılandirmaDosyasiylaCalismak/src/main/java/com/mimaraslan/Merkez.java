package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.musteri.Musteri;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansTumModuller.xml");

		Musteri musteri = context.getBean("BeanMusteri", Musteri.class);

		System.out.println("ADI    : " + musteri.getAdi()
						+"\nSOYADI : "+musteri.getSoyadi()
						+"\nADRESİ : "+musteri.getAdres().getAdres());

		((ConfigurableApplicationContext) context).close();
	}
}
