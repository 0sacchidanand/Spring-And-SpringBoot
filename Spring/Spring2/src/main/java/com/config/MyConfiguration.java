package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class MyConfiguration {
	@Bean
	public Student s1() {
		System.out.println("s1 method call");
		Student s = new Student();
		return s;
	}
}
