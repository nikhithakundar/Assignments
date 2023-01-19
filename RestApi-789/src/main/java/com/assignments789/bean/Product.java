package com.assignments789.bean;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
	public class Product {
		private int id;
		private String name;
		private float cost;

		public Product() {
		}

		public Product(int id, String name, float cost) {
			super();
			this.id = id;
			this.name = name;
			this.cost = cost;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getCost() {
			return cost;
		}

		public void setCost(float cost) {
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
		}

	}
