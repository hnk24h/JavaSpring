package com.springmvc.demo.demo.controllers;

import com.springmvc.demo.demo.entity.User;
import com.springmvc.demo.demo.models.UserModel;
import com.springmvc.demo.demo.reponsitories.UserRepository;
import com.springmvc.demo.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
//    @Autowired
//    private UserRepository userRepository;
    @Autowired(required = true)
    private UserService userService;
//    @GetMapping("/")
//    // Trả về Model là một List<UserModel>
//    public List<UserModel> getUserList() {
//        // Service trả về Model (là List<UserModel>) nên có thể return thẳng luôn
//        return userService.getUserList();
//    }
    @GetMapping("/list")
    public List<User> getAllUser() {
        System.out.println("hello word");
        return userService.getAllUser();
//        return userRepository.findAll();
    }

}
