package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Address;
import com.applicationweb.mairie.repository.Addressrepository;

@Service
public class AddressService_impl implements AddressService {
	@Autowired
	private Addressrepository addressRepository;
	
	@Override
	public Address saveaddress(Address address) {
		return this.addressRepository.save(address);
	}
	
	@Override
	public boolean deleteAddressById(Long id) {
		this.addressRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Address> getAllAddress() {
		
		return addressRepository.findAll();
	}
	
	@Override
	public Address getAddressByid(Long id) {
		java.util.Optional<Address> optional = addressRepository.findById(id);
        Address address1;
		if (optional.isPresent()) {
            address1 = optional.get();
        } else {
            throw new RuntimeException(" Address not found for id :: " + id);
        }
		
		return address1;
	}
	

}
