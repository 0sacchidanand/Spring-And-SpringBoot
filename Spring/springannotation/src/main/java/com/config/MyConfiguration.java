package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.model"} )
public class MyConfiguration {

//	@Bean(name = {"s1","s2"})//user define name
//	@Scope(scopeName = "singleton")
//	public Student s1()
//	{
//		System.out.println("m1 meyhod called");
//		Student s = new Student();
//		return s;
//	}
	
}
