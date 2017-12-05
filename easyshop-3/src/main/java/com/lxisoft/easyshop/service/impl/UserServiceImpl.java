package com.lxisoft.easyshop.service.impl;
/*
 * @Auther Shanees mk
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.easyshop.entity.User;
import com.lxisoft.easyshop.repository.UserRepository;
import com.lxisoft.easyshop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {

		return userRepository.save(user);
	}

	@Override
	public User findOne(Long id) {

		return userRepository.findOne(id);
	}

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User update(User user) {

		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {

		userRepository.delete(id);

	}

}
