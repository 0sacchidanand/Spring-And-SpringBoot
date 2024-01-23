package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class SbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbApplication.class, args);
		EmployeeService es = context.getBean(EmployeeService.class);

//	e.setEname("Bj");
//	e.setEdesignation("Developer");
//	e.setEcompany("Farm");
//	e.setEsalary(100000);
//	System.out.println(es.save(e));
		// System.out.println(es.deleteByEid(4));
		// System.out.println(es.findByEid(7));
		
//	for(Employee e:es.findAll())
//		System.out.println(e);
	
//		for (int i = 1; i <= 1000; i++) {
//			Employee e = new Employee();
//			StringBuilder name = new StringBuilder();
//			for (int j = 1; j <= 9; j++)
//				name.append((char) (new Random().nextInt(26) + 65));
//			e.setEname(name.toString());
//			
//			StringBuilder designation = new StringBuilder();
//			for (int j = 1; j <= 9; j++)
//				designation.append((char) (new Random().nextInt(26) + 65));
//			e.setEdesignation(designation.toString());
//			
//			StringBuilder company = new StringBuilder();
//			for (int j = 1; j <= 9; j++)
//				company.append((char) (new Random().nextInt(26) + 65));
//			e.setEcompany(company.toString());
//			e.setEsalary(new Random().nextDouble()*10000);
//			System.out.println(es.save(e));
//		}
	
//	Employee e= es.findByEidAndEname(15, "XXUMXOSAI");
//	System.out.println(e);
		
		
//		List<Employee> list=es.findByEidOrEname(13, "XXUMXOSAI");
//		for(Employee e:list)
//		{
//			System.out.println(e);
//		}
		
		for(Employee e : es.findByEnameLike("BG"))
		System.out.println(e);
		

	}

}
