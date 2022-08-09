package com.springmvc.demo.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.demo.demo.models.Category;
import com.springmvc.demo.demo.models.Product;
import com.springmvc.demo.demo.reponsitories.CategoryReponsitory;
import com.springmvc.demo.demo.reponsitories.ProductReponsitory;

@Controller
@RequestMapping(path = "products")
public class ProductController {
	@Autowired(required=true)
	ProductReponsitory productReponsitory;
	@Autowired(required=true)
	CategoryReponsitory categoryReponsitory;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String test() {
		return "productList";		
	}
	
	@RequestMapping(value = "/getProductsByCategoryID/{categoryID}", method = RequestMethod.GET)
	public String getProductByCategoryID(ModelMap modelMap, @PathVariable String categoryID) {
		Iterable<Product> products = productReponsitory.findByCategoryID(categoryID);
		modelMap.addAttribute("products", products);
		return "productList";		
	}
	
	@RequestMapping(value = "/changeCategory/{productID}", method = RequestMethod.GET)
	public String changeCategory(ModelMap modelMap, @PathVariable String productID) {
		Iterable<Category> categories = categoryReponsitory.findAll();
		modelMap.addAttribute("categories", categories);
		
		Product product = productReponsitory.findById(productID).get();
		modelMap.addAttribute("product", product);
		return "assign";	
	}
	
	@RequestMapping(value = "/updateProduct/{productID}", method = RequestMethod.POST)
	public String updateProduct(ModelMap modelMap, 
			@ModelAttribute("product") Product product,
			@PathVariable String productID) {
		System.out.println("updateProduct");
		if(productReponsitory.findById(productID).isPresent()) {
			Product findProduct = productReponsitory.findById(productID).get();
			if(product.getProductName() != null) {
				findProduct.setProductName(product.getProductName());
			}
			if(product.getCategoryID() != null) {
				findProduct.setCategoryID(product.getCategoryID());
			}
			if(product.getDescription() != null) {
				findProduct.setDescription(product.getDescription());
			}
			if(product.getPrice() > 0) {
				findProduct.setPrice(product.getPrice());
			}
			
			productReponsitory.save(findProduct);
		}
		
		return "redirect:/products/getProductsByCategoryID/" + product.getCategoryID();		
	}
}
