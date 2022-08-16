package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Personel personel = context.getBean("BeanPersonel", Personel.class);

		System.out.println("ADI        : " + personel.getAdi() + "\nSOYADI     : " + personel.getSoyadi()
				+ "\nGÖREVİ      : " + personel.getGorevi() + "\nDOĞUM YILI  : " + personel.getDogumYili()
				+ "\nMAAŞI       : " + personel.getMaasi() + "\nEHLİYET     : " + personel.isEhliyet()
				+ "\nMEDENİ HALİ : " + personel.isMedeniHali() + "\nANNE ADI    : " + personel.getAnneAdi()
				+ "\nBABA ADI    : " + personel.getBabaAdi() + "\nTELEFON NO  : " + personel.getTelNo()
				+ "\nADRES      : " + personel.getAdres());

		((ConfigurableApplicationContext) context).close();
	}
}
