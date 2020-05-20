package com.hajj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hajj.domain.Candidature;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {

}
