package com.lxisoft.easyshop.service.impl;
/*
 * @Auther Shanees mk
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.easyshop.entity.Role;
import com.lxisoft.easyshop.repository.RoleRepository;
import com.lxisoft.easyshop.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role findByName(String name) {
	
		return roleRepository.findByName(name);
	}

}
