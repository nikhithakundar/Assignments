package com.assignments789.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments789.bean.Product;
import com.assignments789.repository.ProductRepository;

@Service
	public class ProductServiceImpl implements ProductService {
		@Autowired
		ProductRepository repo;

		@Override
		public List<Product> showAllProduct() {
			return repo.findAll();
		}

		@Override
		public Product showById(int id) {
			Optional<Product> product = repo.findById(id);
			Product p = null;
			if(product.isPresent())
			  p=product.get();
			return p;
		}

		@Override
		public Product addProduct(Product product) {
			return repo.insert(product);
		}

		@Override
		public Product updateProduct(Product p) {
			return repo.save(p);
		}

		@Override
		public void deleteProduct(int id) {
			repo.deleteById(id);

		}
	}
