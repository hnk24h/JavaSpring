package com.springmvc.demo.demo.reponsitories;

import com.springmvc.demo.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee, Long> {
}
