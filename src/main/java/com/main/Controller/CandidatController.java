package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.domain.Utilisateur;
import com.main.repository.CandidatRepository;

@RestController
@RequestMapping(value="/Candidat")
public class CandidatController {
	CandidatRepository CR  ;
	
	@Autowired
	CandidatRepository candidatRepository ;
	
	
	@RequestMapping (value = "/")
	public String greesting() {
		return "Hello from Spring Boot";
								}
		
	
	@RequestMapping (value = "/Get/all")
	public List<Candidat> getAll(){
		return candidatRepository.findAll() ;
	}
	
	@PostMapping(value="/Add/load")
	public List<Candidat> persist(@RequestBody final Candidat candidat) {
		candidatRepository.save(candidat) ;
		
		return candidatRepository.findAll() ;	
		}
	
	
	
	
	@RequestMapping (value = "/Find/{id}")
	public Candidat getById(@PathVariable int id) {
		for (Candidat c : candidatRepository.findAll() ) {
			if(c.getIdCandidat() == id ) {
				return c ;
			}
		}
		return null;
	}
	
	
	@DeleteMapping (value = "/Remove/{id}")
	public List<Candidat> removeDb (@PathVariable int id){
		
		for(Candidat c : candidatRepository.findAll()) {
			if (c.getIdCandidat() == id ){
				candidatRepository.delete(c);
			}
		}
		return candidatRepository.findAll();
	}
	
	

}
	

