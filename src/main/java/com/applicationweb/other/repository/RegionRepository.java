package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
	Optional<Region> findByNomRegion(String name);
	
	Boolean existsByNomRegion(String name);
}
