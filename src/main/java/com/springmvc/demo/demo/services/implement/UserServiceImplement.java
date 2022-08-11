package com.springmvc.demo.demo.services.implement;

import com.springmvc.demo.demo.entity.User;
import com.springmvc.demo.demo.models.UserModel;
import com.springmvc.demo.demo.reponsitories.UserRepository;
import com.springmvc.demo.demo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<UserModel> getAllUser() {
        // Tạo mapper object
        ModelMapper mapper = new ModelMapper();
        List<UserModel> userModelList = userRepository.findAll()
                .stream()
                .map(user -> mapper.map(user, UserModel.class))
                .collect(Collectors.toList());
        System.out.println(userModelList);
        return userModelList;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
