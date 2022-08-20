package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.pojo.Yazar;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
				
		Yazar yazar = context.getBean("yazarBean",Yazar.class);
		
		System.out.println("YAZAR : " + yazar.getAdi() + " " + yazar.getSoyadi() + "\nKİTAP : " + yazar.getKitapAdi()
		+ "\nISBN : " + yazar.getKitap().getEserISBN());
		
		context.close();
	}

}
