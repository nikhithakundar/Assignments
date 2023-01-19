package com.practice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.entity.Employee;
import com.practice.exception.EmployeeNotFound;
import com.practice.repo.EmpRepo;

@Service
public class ServiceImpl implements EmpService{

	@Autowired
	EmpRepo repo;
	
	@Override
	public List<Employee> showAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee showById(int id) throws EmployeeNotFound {
		Optional<Employee> ops =repo.findById(id);
		Employee e = null;
		if(ops.isPresent())
		{
			e=ops.get();
		}
		return ops.orElseThrow(()->new EmployeeNotFound(id+" Doesn't exists"));
	}

	@Override
	public Employee add(Employee e)throws EmployeeNotFound {
		
		Optional<Employee> opstu=repo.findById(e.getId());
		if(!opstu.isPresent())
		
		return repo.save(e);
		else 
			return opstu.orElseThrow(()->new EmployeeNotFound(e.getId()+" Already exists"));
	}

	@Override
     public Employee update(Employee e)throws EmployeeNotFound {
		Optional<Employee> opstu=repo.findById(e.getId());
		if(!opstu.isPresent())
			opstu.orElseThrow(()->new EmployeeNotFound(e.getId()+" not exists for modification"));
		
		return repo.save(e);
	}

	@Override
	public void delete(int id) throws EmployeeNotFound {
		Optional<Employee> opstu=repo.findById(id);
		Employee e=null;
		if(!opstu.isPresent())
			opstu.orElseThrow(()->new EmployeeNotFound(id+" Doesn't exists"));
		else
		repo.deleteById(id);
	}
	
}