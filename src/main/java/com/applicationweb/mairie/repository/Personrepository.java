package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Person;

@Repository
public interface Personrepository extends JpaRepository<Person, Long> {

}
