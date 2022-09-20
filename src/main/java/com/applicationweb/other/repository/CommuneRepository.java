package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Commune;

@Repository
public interface CommuneRepository extends JpaRepository<Commune, Long> {
	Optional<Commune> findByNomCommune(String name);
}
