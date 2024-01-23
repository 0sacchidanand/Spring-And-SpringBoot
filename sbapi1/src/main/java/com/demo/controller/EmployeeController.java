package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;

@RestController
public class EmployeeController {
	/* ............................URL.......................... */
	@GetMapping(value = "/")
	public String m1() {

		return "hello m1";
	}

	@GetMapping(value = "/req1")
	public String m2() {
		return "hello m2";
	}

	@GetMapping(value = "/req2")
	public String m3(@RequestParam("a") String s1) {
		System.out.println("m3 method called");
		return s1;
	}

	@GetMapping(value = "/req3")
	public String m4(@RequestParam("a") String s1,@RequestParam("b") String s2)
	{
		return s1+s2;
	}

	/* ..................................URI............................. */
	
	@GetMapping(value = "/req4/{a}")
	public String m5(@PathVariable("a") String s1)
	{
		return s1;
	}
	@GetMapping(value = "/req5/{s1}/{s2}")
	public String m6(@PathVariable String s1,@PathVariable String s2)
	{
		return s1+s2;
	}
	@GetMapping(value = "/req6")
	public int[] m7(@RequestBody int a[])
	{
		return a;
	}
	@GetMapping(value = "/req7")
	public Map<String,Object[]> m8(@RequestBody Map<String,Object[]>m)
	{
		return m;
	}
	@GetMapping(value = "/req8")
	public Employee m9(@RequestBody Employee e)
	{
		return e;
	}
	@GetMapping(value = "/req9")
	public List<Employee> m10(@RequestBody List<Employee> employees)
	{
		return employees;
	}
}
