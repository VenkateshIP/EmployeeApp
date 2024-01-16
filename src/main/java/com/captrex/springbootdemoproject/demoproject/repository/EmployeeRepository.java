package com.captrex.springbootdemoproject.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.captrex.springbootdemoproject.demoproject.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long>{
	
}
