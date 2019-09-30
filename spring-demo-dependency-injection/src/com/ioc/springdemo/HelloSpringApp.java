package com.ioc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring configuration file

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive bean from spring container
			
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on bean
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getTeamCount());
		
		//System.out.println(theCoach2.getDailyWorkout());
		//System.out.println(theCoach2.getTeamCount());
		
		//new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach2.getDailyFortune());
		
		//new method for fortune
		System.out.println(theCoach.getPaymentServiceNotif());
				
		System.out.println(theCoach2.getPaymentServiceNotif());
		
		// close the context
		context.close();
	}

}
