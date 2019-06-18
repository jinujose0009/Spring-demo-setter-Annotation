package com.jinu.learing;

import org.springframework.stereotype.Component;

@Component
public class FortuneImp implements FortuneService {

	@Override
	public String getFortuneservice() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
