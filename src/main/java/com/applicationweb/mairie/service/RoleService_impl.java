package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Role;
import com.applicationweb.mairie.repository.Rolerepository;


@Service
public class RoleService_impl implements RoleService{
	@Autowired
	private Rolerepository roleRepository;
	
	@Override
	public Role saverole(Role role) {
		return this.roleRepository.save(role);
	}
	
	@Override
	public boolean deleteRoleById(Long id) {
		this.roleRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Role>getAllRole(){
		return roleRepository.findAll();
	}
	
	@Override
	public Role getRoleByid(Long id) {
		java.util.Optional<Role> optional = roleRepository.findById(id);
        Role role1;
		if (optional.isPresent()) {
            role1 = optional.get();
        } else {
            throw new RuntimeException("Role not found for id :: " + id);
        }
		
		return role1;
	}

	

}
