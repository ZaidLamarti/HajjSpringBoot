package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.domain.Candidature;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {

	/*
	 * Optional<Candidature> findByUsername(String username);
	 * 
	 * Boolean existsByUsername(String username);
	 * 
	 * Boolean existsByEmail(String email);
	 */
}
