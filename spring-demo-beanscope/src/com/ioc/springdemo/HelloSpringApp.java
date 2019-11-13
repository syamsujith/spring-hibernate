package com.ioc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring configuration file

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive bean from spring container
			
		//Coach theCoach = context.getBean("myCoach", Coach.class);
		// call methods on bean
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		CricketCoach theCoach21 = context.getBean("myCoach", CricketCoach.class);
		
		Coach theCoach3 = context.getBean("myCoach3", Coach.class);
		
		/*System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeamCount());
		System.out.println(theCoach.getPaymentServiceNotif());
		System.out.println(theCoach21.getEmailAddress());
		System.out.println(theCoach21.getTeam());
		System.out.println(theCoach.getPaymentServiceNotif());	*/
		//System.out.println(theCoach2.getDailyWorkout());
		//System.out.println(theCoach2.getTeamCount());
		
		//new method for fortune
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach2.getTeamCount());
		System.out.println(theCoach2.getPaymentServiceNotif());
			
		
		//new method for fortune
		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
		System.out.println(theCoach3.getTeamCount());
		System.out.println(theCoach3.getPaymentServiceNotif());
			
		
		// close the context
		context.close();
	}

}
