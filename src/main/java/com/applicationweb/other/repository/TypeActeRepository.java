package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.enums.ETypeActe;
import com.applicationweb.other.models.TypeActe;

@Repository
public interface TypeActeRepository extends JpaRepository<TypeActe, Long> {
	Optional<TypeActe> findByName(String name);

	Boolean existsByName(ETypeActe name);
}
