package com.spring.annotation.autowiredemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.autowiredemo.Coach;

public class AutoWireAnnotationJavaApp {

	public static void main(String[] args) {
		// Read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrive bean from spring container
				//Coach theCoach = context.getBean("SillyCoach", Coach.class);
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				
				//print methods
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				//System.out.println(theCoach.getDatabaseValue());
				
				//close context
				context.close();

	}

}
