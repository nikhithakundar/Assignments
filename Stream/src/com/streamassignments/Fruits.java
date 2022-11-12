package com.streamassignments;

public class Fruits {
	 int calories;
	 String name;
	 int price;
	 String color;
	public Fruits(int calories, String name, int price, String color) {
		super();
		this.calories = calories;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	@Override
//	public String toString() {
//		return "Fruits [calories=" + calories + ", name=" + name + ", price=" + price + ", color=" + color + "]";
//	}
	 
}
