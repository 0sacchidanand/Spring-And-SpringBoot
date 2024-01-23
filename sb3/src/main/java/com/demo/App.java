package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(App.class, args);
	
	EmployeeService es = context.getBean(EmployeeService.class);
	//Employee e= new Employee();
//	for(int i=1;i<=1000;i++)
//	{
//		
//		StringBuilder name= new StringBuilder();
//		for(int j=1;j<=10;j++)
//			name.append((char)(new Random().nextInt(26)+65));
//		e.setEname(name.toString());
//		StringBuilder company= new StringBuilder();
//		for(int j=1;j<=10;j++)
//			company.append((char)(new Random().nextInt(26)+65));
//		e.setEname(company.toString());
//		StringBuilder designation= new StringBuilder();
//		for(int j=1;j<=10;j++)
//			designation.append((char)(new Random().nextInt(26)+65));
//		e.setEname(designation.toString());
//		e.setEsalary(new Random().nextDouble()*100000);
//		
//	}
	/* insert EMployee*/
	
//	e.setEid(7);
//	e.setEname("Bhima Zate");
//	e.setEdesignation("Developer");
//	e.setEcompany("ABC");
//	e.setEsalary(10000);
//	System.out.println(es.save(e));
	
	/*delete employee*/
	//System.out.println(es.deleteByEid(7));
	//System.out.println(es.deleteByEname("Mandar"));
	//System.out.println(es.findByEid(45));
	for(Employee e:es.findAll())
		System.out.println(e);
	}

}
