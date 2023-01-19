package com.assignments789.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
	public class Order {
		@Id
		private int id;
		private float total;
		private String date;
		private Customer customer;

		public Order() {
		}

		public Order(int id, float total, String date, Customer customer) {
			super();
			this.id = id;
			this.total = total;
			this.date = date;
			this.customer = customer;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getTotal() {
			return total;
		}

		public void setTotal(float total) {
			this.total = total;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", total=" + total + ", date=" + date + ", customer=" + customer + "]";
		}

	}

