package com.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {

	@RequestMapping (value = "/")
	public String greesting() {
		return "Hello From Reda Spring Boot";
	}
	
}
