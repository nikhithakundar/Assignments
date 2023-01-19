package com.assignments789.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments789.bean.Product;
import com.assignments789.service.ProductService;

@RestController
	@RequestMapping("/products")
	public class ProductController {
		
		@Autowired
		ProductService service;
	   
		@GetMapping("/")
		public List<Product> showAllProducts(){
			return service.showAllProduct();
		}
		
		@GetMapping("/{id}")
		public Product showProductById(@PathVariable("id") int id) {
			return service.showById(id);
		}
		
		@PostMapping("/addproduct")
	    public Product addProduct(@RequestBody Product p) {
	    	return service.addProduct(p);
	    }
	    
		@PutMapping("/updateproduct")
	    public Product updateOrder(@RequestBody Product p) {
	    	return service.updateProduct(p);
	    }
		
		@DeleteMapping("/delete/{id}")
		public void deleteProduct(@PathVariable("id") int id) {
			service.deleteProduct(id);
		}
	}
