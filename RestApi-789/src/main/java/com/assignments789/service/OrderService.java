package com.assignments789.service;

import java.util.List;

import com.assignments789.bean.Order;

public interface OrderService {
		   public List<Order> showAllOrder();
		   public Order showById(int id);
		   public Order addOrder(Order order);
		   public Order updateOrder(Order o);
		   public void deleteOrder(int id);
		}