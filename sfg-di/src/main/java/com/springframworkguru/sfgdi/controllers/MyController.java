package com.springframworkguru.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public MyController() {
		// TODO Auto-generated constructor stub
	}

	public String sayHello() {
		System.out.println("hello world");
		return "high folks";
	}
	
}
