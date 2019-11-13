package com.spring.annotation.autowiredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomSerices")
	private FortuneServices fortuneService;
	@Autowired
	private DatabaseAccess dataBaseAccess;
	
	private RESTapiServices restAPIservices;
	
	/*@Autowired
	public TennisCoach(FortuneServices theFortuneServices) {
		fortuneService = theFortuneServices;
		//System.out.println("inside default constructor");
	}
	*/
	/*public TennisCoach(DatabaseAccess dataBaseAccess) {
		System.out.println("inside default constructor");
	}
	*/
	//method injection
	/*@Autowired
	public void doSomeCrazyStuff(RESTapiServices theRestAPIservices) {
		//System.out.println("insde some randome stuff method");
		restAPIservices = theRestAPIservices;
		
	}*/
	
	/*@Autowired
	public void setDatabaseServices(DatabaseAccess dataBaseAccess) {
		System.out.println("isnide setter method");
		this.dataBaseAccess = dataBaseAccess;
	}
	*/
	@Override
	public String getDailyWorkout() {
		
		return "Daily play 2hrs";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDatabaseValue() {
		// TODO Auto-generated method stub
		return dataBaseAccess.getDbData();
	}
	
	@Override
	public String getRESTvalue() {
		// TODO Auto-generated method stub
		return null;
	}

}
