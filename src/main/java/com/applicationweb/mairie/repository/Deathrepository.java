package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Death;

@Repository
public interface Deathrepository extends JpaRepository<Death, Long> {

}
