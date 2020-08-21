package com.springframworkguru.sfgdi.controllers;

import com.springframworkguru.sfgdi.services.GreetingService;

public class PropertyInjectedController {


	public GreetingService greetingService;
	
	public String getGreeting() {
			return greetingService.sayGreeting();
		
	}
	
}
