package com.assignments789.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments789.bean.Customer;
import com.assignments789.repository.CustomerRepository;

@Service
	public class CustomerServiceImpl implements CustomerService {
		@Autowired
		CustomerRepository repo;

		@Override
		public List<Customer> showAllCustomer() {
			return repo.findAll();
		}

		@Override
		public Customer showById(int id) {
			Optional<Customer> customer = repo.findById(id);
			Customer c = null;
			if(customer.isPresent())
			  c=customer.get();
			return c;
		}

		@Override
		public Customer addCustomer(Customer customer) {
			return repo.insert(customer);
		}

		@Override
		public Customer updateCustomer(Customer c) {
			return repo.save(c);
		}

		@Override
		public void deleteCustomer(int id) {
			repo.deleteById(id);

		}

		

}
