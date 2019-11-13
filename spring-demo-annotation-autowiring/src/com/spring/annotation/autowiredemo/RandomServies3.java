package com.spring.annotation.autowiredemo;

import org.springframework.stereotype.Component;

@Component
public class RandomServies3 implements FortuneServices {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "null 3";
	}

}
