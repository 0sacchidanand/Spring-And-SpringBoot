package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	Employee save(Employee e);// Save Or Update used
	
	int deleteByEid(int eid);
	int deleteByEname(String ename);
	Employee findByEid(int eid);
	List<Employee> findAll();

}
