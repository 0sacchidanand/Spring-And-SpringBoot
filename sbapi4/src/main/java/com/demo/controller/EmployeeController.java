package com.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService es;

	@GetMapping(value = "/")
	public Map<String, Collection> m1() {
		Map<String, Collection> m = new HashMap();
		m.put("ABC", es.findByEnameContains("AB"));
		m.put("YZA", es.findByEnameContains("YZ"));
		return m;
	}

	@GetMapping(value = "/req1")
	public Map<String, Collection> m2() {
		Map<String, Collection> m = new HashMap();
		m.put("xxx", es.findByEcompanyContains("xxx"));
		m.put("XYZ", es.findByEcompanyContains("XYZ"));
		return m;
	}

	@GetMapping(value = "/findbyid/{id}")
	public Employee m3(@PathVariable int id) {
		return es.findByEid(id);
	}

	@GetMapping(value = "/findbysalary/{low}/{high}")
	public List<Employee> m4(@PathVariable double low, @PathVariable double high) {
		return es.findByEsalaryBetween(low, high);
	}

	@GetMapping(value = "/findbyname/{name}")
	public List<Employee> m5(@PathVariable String name) {
		return es.findByEnameContains(name);
	}

	@GetMapping(value = "/findbyany/{s1}")
	public List<Employee> m6(@PathVariable String s1) {
		return es.findByAny(s1);
	}

	@PostMapping(value = "/save") //for insert api
	public Employee m6(@RequestBody Employee e) {
		return es.save(e);
	}

	@PutMapping(value = "/update") //for Update
	public Employee m7(@RequestBody Employee e) {
		return es.save(e);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public int m8(@PathVariable int id)
	{
		return es.deleteByEid(id);
	}

}
