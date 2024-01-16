package com.captrex.springbootdemoproject.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.captrex.springbootdemoproject.demoproject.model.Employee;
import com.captrex.springbootdemoproject.demoproject.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	
	//Get all employees
	@CrossOrigin(origins = "*") 
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeerepository.findAll();
	}
	
	//create employee rest api
	@PostMapping("/employees") 
	public Employee createEmployee(@RequestBody Employee employee) { 
	    return employeerepository.save(employee);
	}
}
