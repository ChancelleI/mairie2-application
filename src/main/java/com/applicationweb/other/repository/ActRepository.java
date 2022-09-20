package com.applicationweb.other.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Act;

@Repository
public interface ActRepository extends JpaRepository<Act, Long> {
//	Optional<Act> findByTypeActe(String name);
	
//	@Query("INSERT INTO Act ( id_commune, type_acte ) Values ( :id_commune, :type_acte)")
//	void saveAct(Act a);
}
