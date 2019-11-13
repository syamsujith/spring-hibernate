package com.spring.annotation.autowiredemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseAccess implements DataBaseServices {

	@Override
	public String getDbData() {
	
		return "sending database data";
	}

}
