package com.otostore.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otostore.Civic;
import com.otostore.Sahin;
import com.otostore.Toros;

public class TestAraba {

	public static void main(String[] args) {
		//Civic civic = new Civic();
		
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Civic civic = (Civic) applicationContext.getBean("civic");
		System.out.println(civic);
		
		Sahin sahin = (Sahin) applicationContext.getBean("sahin");
		System.out.println(sahin);
		
		Toros toros = (Toros) applicationContext.getBean("toros");
		System.out.println(toros);
		
		
		

	}

}
