package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

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
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	public Employee findByEidAndEname(int eid, String ename) {
		return ed.findByEidAndEname(eid, ename);
	}

	@Override
	public List<Employee> findByEidOrEname(int eid, String ename) {
		return ed.findByEidOrEname(eid, ename);
	}

	@Override
	public List<Employee> findByEidLessThan(int eid) {
		return ed.findByEidLessThan(eid);
	}

	@Override
	public List<Employee> findByEidLessThanEqual(int eid) {
		return ed.findByEidLessThanEqual(eid);
	}

	@Override
	public List<Employee> findByEsalaryBetween(double low, double high) {
		return ed.findByEsalaryBetween(low, high);
	}

	@Override
	public List<Employee> findByEnameLike(String ename) {
		return ed.findByEnameLike(ename);
	}

	
	

	
	

}
