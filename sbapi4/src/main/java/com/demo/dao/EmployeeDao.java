package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findAll();

	List<Employee> findByEnameContains(String ename);

	List<Employee> findByEcompanyContains(String ecompany);
	
	Employee findByEid(int eid);
	
	List<Employee> findByEsalaryBetween(double low,double high);
	
	@Query(value =  "select * from employee where eid=?1 or esalary=?1  or ename=?1 like %?1% or ecompany like %?1% or edesignation %?1%",
		nativeQuery = true)
	List<Employee> findByAny(String value);
	
	Employee save(Employee e);
	
	int deleteByEid(int eid);
}
