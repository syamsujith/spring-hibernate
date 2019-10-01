package com.ioc.springdemo;

public class HockeyCoach implements Coach {

	private FortuneServices fortuneService;
	private PaymentNotificationService paymentService;
	
	

	public void setFortuneService(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setPaymentService(PaymentNotificationService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practiece Goal keeping daily 15 min";
	}

	@Override
	public Integer getTeamCount() {
		return 7;
	}

	@Override
	public String getDailyFortune() {
		return "Hockey" + fortuneService.getFortune();
	}

	@Override
	public String getPaymentServiceNotif() {
		// TODO Auto-generated method stub
		return "Hockey" + paymentService.getPayment();
	}

}
