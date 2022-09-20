package com.applicationweb.other.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationweb.other.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	Optional<Address> findByEmail(String name);
}
