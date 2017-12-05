package com.lxisoft.easyshop.controller;
/*
 * @Auther Shanees mk
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.easyshop.entity.Role;
import com.lxisoft.easyshop.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping("/role")
	public Role findOne(String name) {

		return roleService.findByName(name);
	}

}
