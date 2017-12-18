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
		
		ArabaType sahin = (ArabaType) applicationContext.getBean("type1");
		ArabaType kartal = (ArabaType) applicationContext.getBean("type2");
		ArabaType dogan = (ArabaType) applicationContext.getBean("type3");
		
		tofas.setSahin(sahin);
		tofas.setKartal(kartal);
		tofas.setDogan(dogan);
		
		System.out.println(tofas);

	}

}
