package com.spring.annotation.autowiredemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneServices {

	@Override
	public String getFortune() {	
		return "Today is your day";
	}

}
