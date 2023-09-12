package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Role;
import com.utp.repository.RoleRepository;

@Service
public class RoleService {
	
	private final RoleRepository roleRepository;

	@Autowired
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	@Transactional
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

}
