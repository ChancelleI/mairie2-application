package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.Address;

@Repository
public interface Addressrepository extends JpaRepository<Address, Long>{

}
