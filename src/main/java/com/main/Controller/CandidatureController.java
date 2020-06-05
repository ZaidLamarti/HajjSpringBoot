package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.domain.Candidature;
import com.main.repository.CandidatRepository;
import com.main.repository.CandidatureRepository;

@RestController
@RequestMapping(value="/Candidature")
public class CandidatureController {
CandidatureRepository CR  ;
	
	@Autowired
	CandidatureRepository candidatureRepository ;
	
	@RequestMapping (value = "/Get/all")
	public List<Candidature> getAll(){
		return candidatureRepository.findAll() ;
	}
	
	
	
	@PostMapping(value="/Add/load")
	public List<Candidature> persist(@RequestBody final Candidature candidat) {
		candidatureRepository.save(candidat) ;
		
		return candidatureRepository.findAll() ;	
		}
	
	
}
