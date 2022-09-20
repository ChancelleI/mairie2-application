package com.applicationweb.mairie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Region;

@Repository
public interface Regionrepository extends JpaRepository<Region, Long>{
	Optional<Region> findByNomRegion(String nom);
	Boolean existsByNomRegion(String nom);
	
}
