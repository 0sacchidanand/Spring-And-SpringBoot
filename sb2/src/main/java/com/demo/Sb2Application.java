package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@SpringBootApplication
public class Sb2Application {

	public static void main(String[] args) {
	ApplicationContext contex=	SpringApplication.run(Sb2Application.class, args);
	EmployeeDao ed=contex.getBean(EmployeeDao.class);
//	Employee e = new Employee();
//	e.setEname("Bharat Mane");
//	e.setEdesignatation("Awt developer");
//	e.setEcompany("Vm");
//	e.setEsalary(800050.0);
//	System.out.println(ed.insertEmployee(e));
	
	//System.out.println(ed.deleteEmployeeByid(3));//delete Employee
	
//	Employee e= ed.findEmployeeByEid(1);// find employee by id
//	System.out.println(e);
	
	//ed.findAllEmployee().forEach(e->System.out.println(e));//find All Employee
	
	Employee e= ed.findEmployeeByEid(1);
	e.setEsalary(750000);
	e.setEcompany("xyz");
	System.out.println(ed.updateEmployee(e));
	}

}
