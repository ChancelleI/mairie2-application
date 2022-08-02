package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Commune;

@Repository
public interface Communerepository extends JpaRepository<Commune, Long> {

}
