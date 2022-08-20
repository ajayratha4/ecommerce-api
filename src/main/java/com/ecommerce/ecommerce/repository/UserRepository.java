package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByUsernameAndPassword(String username, String password);
}
