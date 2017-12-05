package com.lxisoft.easyshop.controller;
/*
 * @Auther Shanees mk
 */
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.easyshop.entity.Role;
import com.lxisoft.easyshop.entity.User;
import com.lxisoft.easyshop.service.RoleService;
import com.lxisoft.easyshop.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@PostMapping("/user")
	public String save(User user,String rePassword,@RequestParam(value="rolesNames") List<String> rolesNames) {
		
			
		
		try {
			if (user.getPassword().equals(rePassword)) {
				Set<Role> rol = new HashSet<Role>();
				for (String r : rolesNames) {
					Role role = null;
					if (roleService.findByName(r) != null) {
						role = roleService.findByName(r);
						rol.add(role);
					}
				}

				user.setRoles(rol);
				userService.save(user);
				return "success";

			} else {
				return "not valid";
			}
		} catch (Exception e) {
			return "Exception";
		}
	}

	@GetMapping("/users")
	public List<User> findAll() {

		return userService.findAll();
	}

	@GetMapping("/user")
	public User findOne(Long id) {

		return userService.findOne(id);
	}

	@PutMapping("/user")
	public void update(User user) {
		userService.update(user);
	}

	@DeleteMapping("/user")
	public void delete(Long id) {
		userService.delete(id);
	}

}
