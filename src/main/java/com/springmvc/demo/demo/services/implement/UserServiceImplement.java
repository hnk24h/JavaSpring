package com.springmvc.demo.demo.services.implement;

import com.springmvc.demo.demo.entity.User;
import com.springmvc.demo.demo.reponsitories.UserRepository;
import com.springmvc.demo.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
