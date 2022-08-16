package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Role;



public interface RoleService {
	public Role saverole(Role role);
	boolean deleteRoleById(Long id);
	public List<Role>getAllRole();
	public Role getRoleByid(Long id);
}
