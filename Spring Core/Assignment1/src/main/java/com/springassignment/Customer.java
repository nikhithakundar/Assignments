package com.springassignment;

public class Customer {
	private int customerId;
	private String customerName;
	private int customerContact;
	private String customerAddress;
	private Address address1;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, int customerContact, String customerAddress,
			Address address1) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		this.address1 = address1;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	/*
	 * public void display() { System.out.println("customerid: " + getCustomerId() +
	 * " Customer name: " + getCustomerName() + " Customer Contact : " +
	 * getCustomerContact() + " CustomerAddress : " + getCustomerAddress() +
	 * "{street:" + getAddress1().getStreet() + "city :" + getAddress1().getCity() +
	 * "}"); }
	 */
//}

	public void display() {
		System.out.println(address1.getCity() + " " + address1.getState() + " " + address1.getStreet() + " "
				+ address1.getZip() + " " + address1.getCountry() + " " + "Cusaddress: " + customerAddress);
	}

}
