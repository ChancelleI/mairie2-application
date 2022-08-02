package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Region;

@Repository
public interface Regionrepository extends JpaRepository<Region, Long>{

}
