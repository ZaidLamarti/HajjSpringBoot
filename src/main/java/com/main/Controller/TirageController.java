package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.domain.Tirage;
import com.main.repository.CandidatRepository;
import com.main.repository.TirageRepository;

@RestController
@RequestMapping(value="/Tirage")
public class TirageController {
	
	TirageRepository TR  ;

	@Autowired
	TirageRepository tirageRepository ;
	
	
	
	
	@RequestMapping (value = "/Get/all")
	public List<Tirage> getAll(){
		return tirageRepository.findAll() ;
	}
	
	
	@PostMapping(value="/Add/load")
	public List<Tirage> persist(@RequestBody final Tirage tirage) {
		tirageRepository.save(tirage) ;
		
		return tirageRepository.findAll() ;	
		}
}
