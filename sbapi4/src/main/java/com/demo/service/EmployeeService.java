package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	List<Employee> findByEnameContains(String ename);

	List<Employee> findByEcompanyContains(String ecompany);

	Employee findByEid(int eid);

	List<Employee> findByEsalaryBetween(double low, double high);

	List<Employee> findByAny(String value);

	Employee save(Employee e);

	int deleteByEid(int eid);

}
