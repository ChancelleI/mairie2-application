package com.applicationweb.other.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Death;

@Repository
public interface DeathRepository extends JpaRepository<Death, Long> {
}
