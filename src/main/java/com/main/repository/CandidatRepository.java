package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.domain.Candidat;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, Long> {

	/*
	 * Optional<Candidat> findByUsername(String username);
	 * 
	 * Boolean existsByUsername(String username);
	 * 
	 * Boolean existsByEmail(String email);
	 */
	
	
}
