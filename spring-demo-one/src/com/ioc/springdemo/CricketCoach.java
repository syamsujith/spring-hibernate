package com.ioc.springdemo;

public class CricketCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public Integer getTeamCount() {
		// TODO Auto-generated method stub
		return 15;
	}

}
