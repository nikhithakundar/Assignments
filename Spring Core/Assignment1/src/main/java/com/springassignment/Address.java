package com.springassignment;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	/*
	 * public String getStreet() { return street; }
	 * 
	 * public void setStreet(String street) { this.street = street; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public String getState() { return state; }
	 * 
	 * public void setState(String state) { this.state = state; }
	 * 
	 * public int getZip() { return zip; }
	 * 
	 * public void setZip(int zip) { this.zip = zip; }
	 * 
	 * public String getCountry() { return country; }
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 */

}
