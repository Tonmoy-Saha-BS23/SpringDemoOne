package com.bs23.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// creating spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans from spring container
		Coach newCoach = context.getBean("myCoach", Coach.class);
		Coach newCoach2 = context.getBean("myCoach2", Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// calling method by the name
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach2.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		System.out.println(newCoach2.getDailyFortune());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getName());
		System.out.println(cricketCoach.getEmailAddress());
		
		context.close();
	}

}
