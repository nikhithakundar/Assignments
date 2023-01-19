package com.assignments789.service;

import java.util.List;

import com.assignments789.bean.Product;

public interface ProductService {
		   public List<Product> showAllProduct();
		   public Product showById(int id);
		   public Product addProduct(Product product);
		   public Product updateProduct(Product p);
		   public void deleteProduct(int id);
		}


