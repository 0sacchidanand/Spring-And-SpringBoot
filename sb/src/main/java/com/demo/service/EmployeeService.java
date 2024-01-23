package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	Employee save(Employee e);

	int deleteByEid(int eid);

	int deleteByEname(String ename);

	List<Employee> findAll();

	Employee findByEidAndEname(int eid, String ename);

	List<Employee> findByEidOrEname(int eid, String ename);

	List<Employee> findByEidLessThan(int eid);

	List<Employee> findByEidLessThanEqual(int eid);
	
	List<Employee>findByEsalaryBetween(double low,double high);
	
	List<Employee> findByEnameLike(String ename);




}
