package com.springmvc.demo.demo.reponsitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.demo.demo.models.Category;

@Repository
public interface CategoryReponsitory extends CrudRepository<Category, String> {
}
