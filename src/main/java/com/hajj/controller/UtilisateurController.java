package com.hajj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hajj.dto.MessageResponse;
import com.hajj.repository.UtilisateurRepository;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@GetMapping("/log/{login}/{password}")
	public ResponseEntity<?> login ( @PathVariable String login , @PathVariable String password ) {
		boolean u = utilisateurRepository.existsByLoginAndPassword(login,password) ;
		return ResponseEntity.ok(new MessageResponse(u)) ;
	}

}