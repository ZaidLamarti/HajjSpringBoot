package com.hajj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hajj.domain.Tirage;

@Repository
public interface TirageRepository extends JpaRepository<Tirage, Long> {

}
