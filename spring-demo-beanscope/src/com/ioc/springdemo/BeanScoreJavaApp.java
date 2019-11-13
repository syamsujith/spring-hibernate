package com.ioc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScoreJavaApp {

	public static void main(String[] args) {

		// Load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscope-applicationcontext.xml");

		// retrieve the Bean from spring container
		Coach theCoach = context.getBean("myCoach2", Coach.class);
		
		Coach theAlphaCoach = context.getBean("myCoach2", Coach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		
		System.out.println("Pointing to the same object: "+ result);
		System.out.println("Memory location for thecoach: "+ theCoach);
		System.out.println("Memory location for theAlphaCoach: "+ theAlphaCoach);
		
		// close context
		context.close();
	}

}
