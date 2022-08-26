package com.rama.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@GetMapping("welcome/{name}")
	public String hello(@PathVariable String name)
	{
	String msg=name+" how are you...";
	return "Hi "+msg+" Welcome to Spring boot Rest with Jenkins...!!";
	}
}
