package com.demo.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome To My Demo Project";
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "Greeting To My Demo Project";
	}

}
