package com.springframworkguru.sfgdi.controllers;

import com.springframworkguru.sfgdi.services.GreetingService;

public class SetterInjectedController {

	public SetterInjectedController() {
		// TODO Auto-generated constructor stub
	}
	
	private GreetingService greetingService;


	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
