package com.hajj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hajj.domain.Candidat;
import com.hajj.repository.CandidatRepository;

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