package com.spring.annotation.autowiredemo;

import org.springframework.stereotype.Component;

@Component
public class RESTapiServices implements RESTServices {

	@Override
	public String getRestService() {
		
		return "receiving rest data";
	}

}
