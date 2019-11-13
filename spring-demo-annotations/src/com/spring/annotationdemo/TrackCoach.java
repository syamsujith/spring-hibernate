package com.spring.annotationdemo;

import org.springframework.stereotype.Component;

//@Component("SillyCoach")
@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice Daily 2hrs";
	}

}
