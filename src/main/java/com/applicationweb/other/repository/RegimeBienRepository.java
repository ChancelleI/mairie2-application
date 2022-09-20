package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.enums.ERegimeBien;
import com.applicationweb.other.models.RegimeBien;

@Repository
public interface RegimeBienRepository extends JpaRepository<RegimeBien, Long> {
	Optional<RegimeBien> findByName(String name);

	Boolean existsByName(ERegimeBien name);
}
