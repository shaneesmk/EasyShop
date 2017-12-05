package com.lxisoft.easyshop.service;
/*
 * @Auther Shanees mk
 */
import org.springframework.stereotype.Service;

import com.lxisoft.easyshop.entity.Role;

@Service
public interface RoleService  {
	
	public Role findByName(String name);

}
