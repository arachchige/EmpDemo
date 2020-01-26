package com.gayan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayan.model.Employee;
import com.gayan.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo ;
	
	public List <Employee> getEmployees(){
		return employeeRepo.findAll();
	}

	public Employee saveEmployee(Employee e) {
		
		return employeeRepo.save(e);
	}

}
