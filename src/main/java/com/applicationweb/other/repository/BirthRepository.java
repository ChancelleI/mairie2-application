package com.applicationweb.other.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Birth;

@Repository
public interface BirthRepository extends JpaRepository<Birth, Long> {
}
