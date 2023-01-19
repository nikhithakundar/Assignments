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

import com.assignments789.bean.Order;
import com.assignments789.service.OrderService;

@RestController
	@RequestMapping("/orders")
	public class OrderController {
		
		@Autowired
		OrderService service;
	   
		@GetMapping("/")
		public List<Order> showAllOrders(){
			return service.showAllOrder();
		}
		
		@GetMapping("/{id}")
		public Order showOrderById(@PathVariable("id") int id) {
			return service.showById(id);
		}
		
		@PostMapping("/addorder")
	    public Order addOrder(@RequestBody Order o) {
	    	return service.addOrder(o);
	    }
	    
		@PutMapping("/updateorder")
	    public Order updateOrder(@RequestBody Order o) {
	    	return service.updateOrder(o);
	    }
		
		@DeleteMapping("/delete/{id}")
		public void deleteOrder(@PathVariable("id") int id) {
			service.deleteOrder(id);
		} 
	}

