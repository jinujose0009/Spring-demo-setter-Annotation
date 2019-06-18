package com.jinu.learing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach=context.getBean("trackCoach",Coach.class);
		System.out.println(thecoach.getDailyworkout());
		System.out.println(thecoach.getDailyfortunes());
		context.close();

	}

}
