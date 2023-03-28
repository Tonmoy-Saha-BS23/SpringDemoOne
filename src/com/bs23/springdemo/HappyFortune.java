package com.bs23.springdemo;

public class HappyFortune implements FortuneService{

	@Override
	public String getFortune() {
		return "Have a good day!";
	}
	
}
