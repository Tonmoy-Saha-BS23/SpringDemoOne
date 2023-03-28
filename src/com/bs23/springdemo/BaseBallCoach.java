package com.bs23.springdemo;

public class BaseBallCoach implements Coach{
	private FortuneService fortune;
	
	public BaseBallCoach(FortuneService fortuneService) {
		fortune = fortuneService;
	}
	public BaseBallCoach() {
		
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute on net";
	}
	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
}
