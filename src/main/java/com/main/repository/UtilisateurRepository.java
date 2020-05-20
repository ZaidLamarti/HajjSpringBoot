package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.domain.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

	/*
	 * Optional<Utilisateur> findByUsername(String username);
	 * 
	 * Boolean existsByUsername(String username);
	 * 
	 * Boolean existsByEmail(String email);
	 */
	
}
