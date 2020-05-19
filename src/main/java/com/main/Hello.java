package com.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.repository.CandidatRepository;

@RestController
@RequestMapping("/api")
public class Hello {
	
	@Autowired
	CandidatRepository candidatRepository;
	
	@GetMapping("/all")
	public String greeting () {
		List<Candidat> a = candidatRepository.findAll();
		return "Hello Zaid !" ;
	}

}