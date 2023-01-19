package com.practice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Employee;
import com.practice.exception.EmployeeNotFound;
import com.practice.service.EmpService;

@RestController
public class EmpController
{
	@Autowired
	EmpService ser;

	@GetMapping("/")
	public List<Employee> getEmployee(){
		return ser.showAll();
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) throws EmployeeNotFound {
		return ser.showById(id);
	}
		
		
    
    
     @PostMapping("/addemployee")
 	public String addStudent(@RequestBody Employee employee)throws EmployeeNotFound
     {
    	Employee e = ser.add(employee);
    	if(e!=null)
    	{
    		
    		return "Employee added successfully";
    	}
    		
    	else
    	{
    		
    		return "Employee didn't added";
    	}
 	  
 		}
     @DeleteMapping("/delete/{id}")
		public String deleteemployeeById(@PathVariable("id") int id) throws EmployeeNotFound {
		ser.delete(id);
		return "Employee deleted success";
		
		}
       

		@PutMapping("/updateemployee")
		public Employee updateEmployee(@RequestBody Employee employee) throws EmployeeNotFound
		{
			return ser.update(employee);
			
		}
     
 	}
	     
			 
			 
			 
        
	
	

