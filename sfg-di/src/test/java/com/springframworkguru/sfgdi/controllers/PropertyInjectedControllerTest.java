package com.springframworkguru.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springframworkguru.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {


	PropertyInjectedController controller;
	
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
		
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
		//fail("Not yet implemented");
	}

}
