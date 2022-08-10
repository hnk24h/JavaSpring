package com.springmvc.demo.demo.controllers;

import com.springmvc.demo.demo.entity.Employee;
import com.springmvc.demo.demo.reponsitories.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {

    @Autowired
    private EmployeeReponsitory employeeReponsitory;

    @GetMapping("/employees")
    public List<Employee> fetchEmployees(){
     return employeeReponsitory.findAll();
    }
}
