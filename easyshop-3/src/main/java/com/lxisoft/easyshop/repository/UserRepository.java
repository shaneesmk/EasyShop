package com.lxisoft.easyshop.repository;
/*
 * @Auther Shanees mk
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.easyshop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
