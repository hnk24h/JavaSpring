package com.springmvc.demo.demo.reponsitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springmvc.demo.demo.models.Product;

@Repository
public interface ProductReponsitory extends CrudRepository<Product, String> {
	Iterable<Product> findByCategoryID(String categoryID);
}
