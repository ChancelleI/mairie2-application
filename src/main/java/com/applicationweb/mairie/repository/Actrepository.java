package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Act;


@Repository
public interface Actrepository extends JpaRepository<Act, Long>{

}
