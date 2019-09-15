package com.ioc.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	
		return "Run a hard 5K";
	}

	@Override
	public Integer getTeamCount() {
		// TODO Auto-generated method stub
		return 6;
	}

}
