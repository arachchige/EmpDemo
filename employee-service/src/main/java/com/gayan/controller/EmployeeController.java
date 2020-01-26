package com.gayan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gayan.model.Employee;
import com.gayan.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	/*fetch data from db */
	@GetMapping
	public List<Employee> fetchEmployees(){
		return empService.getEmployees();
	}
	
	/* map post req with json and save to db*/
	@PostMapping
	public Employee saveEmployee(@RequestBody final Employee e){
		return empService.saveEmployee(e);
	}
	
	/* map form data into employee obj and save to db*/
	@PostMapping("/form")
	public Employee saveEmployeeForm(@ModelAttribute final Employee e){
		return empService.saveEmployee(e);
	}
}
