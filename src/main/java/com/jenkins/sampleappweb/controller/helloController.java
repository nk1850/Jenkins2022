package com.jenkins.sampleappweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "<h1>Welcome to Jenkins </h1>";
	}

	
	@RequestMapping("/hi")
	public String sayHi()
	{
		return "<h1>Welcome to Jenkins and saying hi </h1>";
	}
	
	@RequestMapping("/bye")
	public String sayBye()
	{
		return "<h1>Good Bye </h1>";
	}
	
	@RequestMapping("/welcome")
	public String sayWelcome()
	{
		return "<h1>Welcome </h1>";
	}
	
	@RequestMapping("/greet")
	public String greet()
	{
		return "<h1>Good Morining !! </h1>";
	}
}
