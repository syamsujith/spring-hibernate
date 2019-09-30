package com.ioc.springdemo;

public class CricketCoach implements Coach{
	
	//Define a private field for define constructor
	private FortuneServices fortuneService;
	private PaymentNotificationService paymentNotification;
	
	
	
	public CricketCoach(FortuneServices fortuneService, PaymentNotificationService paymentNotification) {
		this.fortuneService = fortuneService;
		this.paymentNotification = paymentNotification;
	}

	/*public CricketCoach(PaymentNotificationService paymentNotification) {
		this.paymentNotification = paymentNotification;
	}

	//Define a constructor for dependency injection
	public CricketCoach(FortuneServices theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public Integer getTeamCount() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneservice to get fortune
		return fortuneService.getFortune();
	}
	
	public String getPaymentServiceNotif() {
		return "Cricket Coach:" + paymentNotification.getPayment();
	}

}
