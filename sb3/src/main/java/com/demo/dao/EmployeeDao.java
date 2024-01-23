package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends  JpaRepository<Employee, Integer>{
	Employee save(Employee e);//Save Or Delete
	
	int deleteByEid(int eid); //delete
	
	int deleteByEname(String ename);
	
	Employee findByEid(int eid);
	
	List<Employee> findAll();

}
