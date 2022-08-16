package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Address;



public interface AddressService {
	
	public Address saveaddress(Address address);
	boolean deleteAddressById(Long id);
	public List<Address>getAllAddress();
	public Address getAddressByid(Long id);

}
