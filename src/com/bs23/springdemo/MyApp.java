package com.bs23.springdemo;

public class MyApp {
	public static void main(String[] args) {
		
		// creating a coach object
		Coach theCoach = new BaseBallCoach();
		Coach theCoach2 = new TrackCoach();
		
		//calling getDailymethod
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
	}
}
