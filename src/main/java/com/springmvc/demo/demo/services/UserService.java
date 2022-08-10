package com.springmvc.demo.demo.services;

import com.springmvc.demo.demo.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    List<User> getAllUser();
}
