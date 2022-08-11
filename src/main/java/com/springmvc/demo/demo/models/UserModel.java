package com.springmvc.demo.demo.models;

import com.springmvc.demo.demo.entity.User;

// Có hậu tố Model là Model
public class UserModel {
    public String name;
    public Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

