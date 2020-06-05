package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.Candidat;
import com.main.domain.Utilisateur;
import com.main.repository.UtilisateurRepository;

import jdk.nashorn.internal.objects.annotations.Getter;

@RestController
@RequestMapping(value="/User")
public class UtilisateurController {
	
	@Autowired
	UtilisateurRepository utilisateurRepository ;
	
	
	
	@RequestMapping(value="/check/{login}/{password}")
	public Utilisateur verify(@PathVariable String login , @PathVariable String password ) {
		
		//boolean u = utilisateurRepository.existsByLoginAndPassword(login, password);
		
		return utilisateurRepository.findByLoginAndPassword(login, password) ;
	}
	
	
	
	@PostMapping(value="/Add/load")
	public List<Utilisateur> persist(@RequestBody final Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur) ;
		return utilisateurRepository.findAll() ;	}
	
	
	
	@RequestMapping (value = "/Get/all")
	public List<Utilisateur> getAll(){
		List<Utilisateur> utilisateurs = utilisateurRepository.findAll();
		return utilisateurs ;
	}
	
	
	@RequestMapping (value = "/Find/{id}")
	public Utilisateur getById(@PathVariable int id ) {
		for ( Utilisateur u : utilisateurRepository.findAll() ) {
			if(u.getIdUtilisateur() == id ) {
				return u ;
			}
		}
		return null;
	}
	
	
	
	@RequestMapping (value="/Remove/{id}")
	public List<Utilisateur> removeDb (@PathVariable int id){
		
		for (Utilisateur u : utilisateurRepository.findAll() ) {
			if(u.getIdUtilisateur() == id ) {
				utilisateurRepository.delete(u);
			}
		}
		return utilisateurRepository.findAll() ;
	}
	
	@Getter
	@RequestMapping(value = "/Auth/{login}/{pass}")
	public String connect( @PathVariable String login , @PathVariable String pass) {
		
		for(Utilisateur u : utilisateurRepository.findAll()) {
			if(u.getLogin() == login ) {
				if(u.getPassword() == pass) {
												return "true" ;
											} 
												
										}
			
							 								}
		return "false" ;
	}
	
	
	
}

