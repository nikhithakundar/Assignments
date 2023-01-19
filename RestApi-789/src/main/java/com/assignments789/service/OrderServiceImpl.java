package com.assignments789.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments789.bean.Order;
import com.assignments789.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository repo;

	@Override
	public List<Order> showAllOrder() {
		return repo.findAll();
	}

	@Override
	public Order showById(int id) {
		Optional<Order> order = repo.findById(id);
		Order o = null;
		if(order.isPresent())
		  o=order.get();
		return o;
	}

	@Override
	public Order addOrder(Order order) {
		return repo.insert(order);
	}

	@Override
	public Order updateOrder(Order o) {
		return repo.save(o);
	}

	@Override
	public void deleteOrder(int id) {
		repo.deleteById(id);

	}

}
