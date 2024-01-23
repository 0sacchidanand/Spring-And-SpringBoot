package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao ed;

	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	public List<Employee> findByEnameContains(String ename) {
		return ed.findByEnameContains(ename);
	}

	@Override
	public List<Employee> findByEcompanyContains(String ecompany) {
		return ed.findByEcompanyContains(ecompany);
	}

	@Override
	public Employee findByEid(int eid) {
		return ed.findByEid(eid);
	}

	@Override
	public List<Employee> findByEsalaryBetween(double low, double high) {
		return ed.findByEsalaryBetween(low, high);
	}

	@Override
	public List<Employee> findByAny(String value) {
		return ed.findByAny(value);
	}

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}

	@Override
	public int deleteByEid(int eid) {
		return ed.deleteByEid(eid);
	}

}
