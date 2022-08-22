package com.mimaraslan.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		// Aynı before metodu gibi
		System.out.println("****Çağırılan metodun ÖNCEKİ durumu.");

		System.out.println("****Çağrılan metodun adı : " + invocation.getMethod().getName());

		System.out.println("***Çağırılan metodun argümentleri : " + Arrays.toString(invocation.getArguments()));
		
		try {
			//proceed normal sıradan bir metot çağırımıdır.
			Object result = invocation.proceed();
			//Aynı AfterReturnin metodu gibidir.
			System.out.println("****Çağırılan metodun SONRAKİ durumu.");
			return result;
			
		}catch(IllegalArgumentException e) {
			System.out.println("****Çağırılan metoda İSTİSNA meydana gelme durumu");
			throw e;
		}
	}
}
