package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.main")
@ComponentScan("com.main.Controller")
@ComponentScan("com.main.domain")
@ComponentScan("com.main.repository")
@ComponentScan("com.main.Service")
public class HajjMain {
	
	public static void main(String[] args) {
		
		SpringApplication.run( HajjMain.class , args) ;
		
	}

}
