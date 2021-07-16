package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to Azure Java app";
	}
	
	//Add comment
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to Azure app";
	}
	
	@GetMapping("/hello")
	public String getHelloMessage() {
		return "Hello!! Welcome to Java app on Azure.....";
	}

}
