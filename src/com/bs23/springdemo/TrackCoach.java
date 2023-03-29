package com.bs23.springdemo;

public class TrackCoach implements Coach {
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run daily for an hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff method");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("Trackcoach: inside doMyDestroyStuff method");
	}

}
