package com.bs23.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		System.out.println("Check for Singleton scope\n-------------------------------");
		if(theCoach == theCoach2) {
			System.out.println("Sharing the same space");
			System.out.println("Memmory location for the coachone: " + theCoach);
			System.out.println("Memory location for the coach2: " + theCoach2 + '\n');
			
		}
		
		Coach baseCoach = context.getBean("myCoach2", Coach.class);
		
		Coach baseCoach2 = context.getBean("myCoach2", Coach.class);
		System.out.println("Check for prototype scope\n-------------------------------");
		if(baseCoach != baseCoach2) {
			System.out.println("Not sharing the same space");
			System.out.println("The memory space for baseCoach1: " + baseCoach);
			System.out.println("The memory space for baseCoach2: " + baseCoach2);
		}
		
		context.close();

	}

}
