package com.main.controllers;

import java.sql.Date;
import java.time.LocalDate;

import javax.sql.rowset.spi.SyncFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.domain.Candidature;
import com.main.repository.CandidatRepository;

@RestController
public class helloControler {

	
	@RequestMapping (value = "/")
	public String greesting() {
		
		return "Hello from Spring Boot";
								}
	
		
}
