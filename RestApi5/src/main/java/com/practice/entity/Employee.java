package com.practice.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee
{
	@Id
	private int id;
	private String name;
	private String department;
	private String designation;
	private int salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String department, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empentity [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	

}
