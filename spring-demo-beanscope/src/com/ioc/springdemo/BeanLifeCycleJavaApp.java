package com.ioc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleJavaApp {

	public static void main(String[] args) {
		//Load Spring configuration File
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanlifecycle-applicationcontext.xml");
		
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach2", Coach.class);
		
		//Print the result
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
