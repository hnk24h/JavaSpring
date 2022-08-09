package com.springmvc.demo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.demo.demo.models.Category;
import com.springmvc.demo.demo.reponsitories.CategoryReponsitory;

@Controller
@RequestMapping(path = "categories")
// http://localhost:8083/categories
public class CategoryController {
	@Autowired(required=true) // Inject "categoryReponsitory" - DI
	private CategoryReponsitory categoryReponsitory;
    // return name of "jsp file"
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap) {
        // data send to jsp => ModelMap
    	Iterable<Category> categories = categoryReponsitory.findAll();
    	modelMap.addAttribute("categories", categories);
        return "category";
    }
}
