package com.bs23.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String name;
	private String emailAddress;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("CricketCoach: Inside setter - Name");
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter - Email");
		this.emailAddress = emailAddress;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getFortuneService() {
		return this.fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice daily 2 hour";
	}

	@Override
	public String getDailyFortune() {
		return getFortuneService().getFortune();
	}

}
