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

@RestController
@RequestMapping(value="/User")
public class UtilisateurController {
	
	@Autowired
	UtilisateurRepository utilisateurRepository ;
	
	
	
	@RequestMapping(value="/check/{login}/{password}")
	public boolean verify(@PathVariable String login , @PathVariable String password ) {
		for(Utilisateur u : utilisateurRepository.findAll() ) {
		
		if(u.getLogin() == login ) {
			if(u.getPassword() == password) {
				return true ;
			}
			else return false ; 
		}
									}
		return false;
		
	}
	
	
	
	@PostMapping(value="/Add/load")
	public List<Utilisateur> persist(@RequestBody final Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur) ;
		return utilisateurRepository.findAll() ;	}
	
	
	
	@RequestMapping (value = "/Get/all")
	public List<Utilisateur> getAll(){
		return utilisateurRepository.findAll() ;
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
	
	
	@RequestMapping(value = "/Auth/{login}/{pass}")
	public boolean connect( @PathVariable String login , @PathVariable String pass) {
		
		for(Utilisateur u : utilisateurRepository.findAll()) {
			if(u.getLogin() == login ) {
				if(u.getPassword() == pass) {
												return true ;
											} 
												
										}
			
															}
		return false ;
	}
	
	
	
}

