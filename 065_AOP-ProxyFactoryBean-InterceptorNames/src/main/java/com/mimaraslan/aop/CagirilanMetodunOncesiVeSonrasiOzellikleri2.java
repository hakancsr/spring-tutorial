package com.mimaraslan.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri2 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		// Aynı before metodu gibi
		System.out.println("### 2: Çağırılan metodun ÖNCEKİ durumu.");

		System.out.println("### 2: Çağrılan metodun adı : " + invocation.getMethod().getName());

		System.out.println("### 2: Çağırılan metodun argümentleri : " + Arrays.toString(invocation.getArguments()));
		
		try {
			//proceed normal sıradan bir metot çağırımıdır.
			Object result = invocation.proceed();
			//Aynı AfterReturnin metodu gibidir.
			System.out.println("### 2: Çağırılan metodun SONRAKİ durumu.");
			return result;
			
		}catch(IllegalArgumentException e) {
			System.out.println("### 2: Çağırılan metoda İSTİSNA meydana gelme durumu");
			throw e;
		}
	}
}
