package com.practice.service;

import java.util.List;

import com.practice.entity.Employee;
import com.practice.exception.EmployeeNotFound;
public interface EmpService 
{
		public List<Employee> showAll() ;
		public Employee showById(int id)throws EmployeeNotFound;
		public Employee add(Employee e)throws EmployeeNotFound;
		public Employee update(Employee e)throws EmployeeNotFound;
		public void delete(int id)throws EmployeeNotFound;
		
	}



