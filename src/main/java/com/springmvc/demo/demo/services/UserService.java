package com.springmvc.demo.demo.services;

import com.springmvc.demo.demo.entity.User;
import com.springmvc.demo.demo.models.UserModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    List<UserModel> getAllUser();
     public User saveUser(User user);
}
