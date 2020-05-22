package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.repository.CandidatRepository;

@RestController
public class helloControler {
	CandidatRepository CR  ;
	
	@Autowired
	CandidatRepository candidatRepository ;
	@RequestMapping (value = "/")
	public String greesting() {
		
		return "Hello from Spring Boot";
								}
		
	@RequestMapping (value = "/all")
	public List<Candidat> getAll(){
		return candidatRepository.findAll() ;
	}
	
	@PostMapping(value="/load")
	public List<Candidat> persist(@RequestBody final Candidat candidat) {
		candidatRepository.save(candidat) ;
		
		return candidatRepository.findAll() ;	}
	
}
