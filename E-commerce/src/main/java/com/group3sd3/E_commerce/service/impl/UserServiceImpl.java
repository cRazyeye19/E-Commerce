package com.group3sd3.E_commerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group3sd3.E_commerce.model.User;
import com.group3sd3.E_commerce.repository.UserRepository;
import com.group3sd3.E_commerce.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser;
    }
}
