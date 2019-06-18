package com.jinu.learing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
    private FortuneService fortuneservice;
    
	public FortuneService getFortuneservice() {
		return fortuneservice;
	}
    @Autowired
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Run daily 30 min";
	}

	@Override
	public String getDailyfortunes() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortuneservice();
	}
	

}
