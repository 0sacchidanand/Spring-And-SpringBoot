package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements  EmployeeService{
	
	@Autowired
	private EmployeeDao ed;

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}

	@Override
	public int deleteByEid(int eid) {
		return ed.deleteByEid(eid);
	}

	@Override
	public int deleteByEname(String ename) {
		return ed.deleteByEname(ename);
	}

	@Override
	public Employee findByEid(int eid) {
		return ed.findByEid(eid);
	}

	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}

}
