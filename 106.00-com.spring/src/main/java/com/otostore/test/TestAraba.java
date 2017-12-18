package com.otostore.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.otostore.Civic;

public class TestAraba {

	public static void main(String[] args) {
		//Civic civic = new Civic();
		BeanFactory beanFactory = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Civic civic = (Civic) beanFactory.getBean("civic");
		civic.brake();
		AbstractApplicationContext abstractApplicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Civic civic2 = (Civic) abstractApplicationContext.getBean("civic");
		civic2.brake();
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Civic civic3 = (Civic) applicationContext.getBean("civic");
		civic3.brake();
		ConfigurableApplicationContext configurableApplicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Civic civic4 = (Civic) configurableApplicationContext.getBean("civic");
		civic4.brake();

	}

}
