package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee save(Employee e);

	int deleteByEid(int eid);

	int deleteByEname(String ename);

	Employee findByEid(int eid);

	List<Employee> findAll();

	Employee findByEidAndEname(int eid, String ename);

	List<Employee> findByEidOrEname(int eid, String ename);

	List<Employee> findByEidLessThan(int eid);

	List<Employee> findByEidLessThanEqual(int eid);

	List<Employee>findByEsalaryBetween(double low,double high);
	
	List<Employee> findByEnameLike(String ename);

}
