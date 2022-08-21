package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ISelam obj = (ISelam) context.getBean("selam");
		obj.mesajYaz("Güzel gören, güzel düşünür.\nGüzel düşünen hayatından lezzet alır.");
	}

}
