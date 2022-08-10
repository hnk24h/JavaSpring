package com.springmvc.demo.demo.reponsitories;

import com.springmvc.demo.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {
}
