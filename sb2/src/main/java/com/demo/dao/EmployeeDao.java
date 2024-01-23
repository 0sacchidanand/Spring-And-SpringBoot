package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	int insertEmployee(Employee e);
	
	int deleteEmployeeByid(int eid);
	Employee findEmployeeByEid(int eid);
	List<Employee> findAllEmployee();
	int updateEmployee(Employee e);
}
