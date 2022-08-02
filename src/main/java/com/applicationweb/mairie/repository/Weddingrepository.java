package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Wedding;

@Repository
public interface Weddingrepository extends JpaRepository<Wedding, Long>{

}
