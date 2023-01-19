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

import com.assignments789.bean.Customer;
import com.assignments789.service.CustomerService;

@RestController
	@RequestMapping("/customers")
	public class CustomerController {
		
		@Autowired
	    CustomerService service;
	   
		@GetMapping("/")
		public List<Customer> showAllCustomers(){
			return service.showAllCustomer();
		}
		
		@GetMapping("/{id}")
		public Customer showProductById(@PathVariable("id") int id) {
			return service.showById(id);
		}
		
		@PostMapping("/addcustomer")
	    public Customer addCustomer(@RequestBody Customer c) {
	    	return service.addCustomer(c);
	    }
	    
		@PutMapping("/updatecustomer")
	    public Customer updateCustomer(@RequestBody Customer c) {
	    	return service.updateCustomer(c);
	    }
		
		@DeleteMapping("/delete/{id}")
		public void deleteCustomer(@PathVariable("id") int id) {
			service.deleteCustomer(id);
		}
	}

