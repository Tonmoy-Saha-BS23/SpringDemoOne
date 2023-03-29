package com.bs23.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();

	}

}
