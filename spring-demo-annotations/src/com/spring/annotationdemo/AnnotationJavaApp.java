package com.spring.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationJavaApp {

	public static void main(String[] args) {
		
		// Read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		//Coach theCoach = context.getBean("SillyCoach", Coach.class);
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		//print methods
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
