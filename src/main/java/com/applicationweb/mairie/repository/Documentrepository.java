package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Document;

@Repository
public interface Documentrepository extends JpaRepository<Document, Long> {

}
