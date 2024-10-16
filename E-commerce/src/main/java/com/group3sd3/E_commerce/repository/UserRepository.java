package com.group3sd3.E_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group3sd3.E_commerce.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
