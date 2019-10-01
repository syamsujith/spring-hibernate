package com.ioc.springdemo;

public class TrackCoach implements Coach {

	private FortuneServices fortuneService;
	private PaymentNotificationService paymentNotification;
	
	

	public TrackCoach(FortuneServices fortuneService, PaymentNotificationService paymentNotification) {
		this.fortuneService = fortuneService;
		this.paymentNotification = paymentNotification;
	}

	public TrackCoach() {
		
	}
	
	/*public TrackCoach(PaymentNotificationService paymentNotification) {
		super();
		this.paymentNotification = paymentNotification;
	}
	
	public TrackCoach(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public Integer getTeamCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it" + fortuneService.getFortune();
	}

	@Override
	public String getPaymentServiceNotif() {
		// TODO Auto-generated method stub
		return "Track coach: " + paymentNotification.getPayment();
	}

}
