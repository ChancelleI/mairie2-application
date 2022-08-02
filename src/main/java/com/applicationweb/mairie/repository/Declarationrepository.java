package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Declaration;

@Repository
public interface Declarationrepository extends JpaRepository<Declaration, Long> {

}
