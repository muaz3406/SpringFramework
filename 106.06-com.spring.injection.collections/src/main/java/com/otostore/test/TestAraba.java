package com.otostore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otostore.ArabaType;
import com.otostore.Tofas;

public class TestAraba {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Tofas tofas = (Tofas) applicationContext.getBean("tofas");
		
		System.out.println(tofas);

	}

}
