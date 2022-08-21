package com.mimaraslan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Operatorler operatorler = context.getBean("operatorlerBean", Operatorler.class);

		System.out.println("eualTest : " + operatorler.isEqualTest() + "\n"
				+ "notEqualTest : " + operatorler.isNotEqualTest() + "\n"
				+ "lessThanTest : " + operatorler.isLessThanTest() + "\n"
				+ "lessThanOrEqualTest : " + operatorler.isLessThanOrEqualTest() + "\n"
				+ "greatherThanTest : " + operatorler.isGreatherThanTest() + "\n"
				+ "greatherThanOrEqualTest : " + operatorler.isGreatherThanOrEqualTest() + "\n"
				+ "andTest : " + operatorler.isAndTest() + "\n"
				+ "orTest : " + operatorler.isOrTest() + "\n"
				+ "addTest : " + operatorler.getAddTest() + "\n"
				+ "addStringTest : " + operatorler.getAddStringTest() + "\n"
				+ "subtractionTest : " + operatorler.getSubtractionTest() + "\n"
				+ "multiplicationTest : " + operatorler.getMultiplicationTest() + "\n"
				+ "divisionTest : " + operatorler.getDivisionTest() + "\n"
				+ "modulustTest : " + operatorler.getModulusTest() + "\n"
				+ "greatherThanTest : " + operatorler.isGreatherThanTest() + "\n"
				+ "exponentialPowerTest : " + operatorler.getExponentialPowerTest()
				);

		((ConfigurableApplicationContext) context).close();
	}
}
