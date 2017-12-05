package com.lxisoft.easyshop.service;
/*
 * @Auther Shanees mk
 */
import java.util.List;

import org.springframework.stereotype.Service;

import com.lxisoft.easyshop.entity.User;

@Service
public interface UserService {

	public User save(User user);

	public User findOne(Long id);

	public List<User> findAll();

	public User update(User user);

	public void delete(Long id);

}
