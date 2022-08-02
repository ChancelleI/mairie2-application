package com.applicationweb.mairie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.mairie.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {

}
