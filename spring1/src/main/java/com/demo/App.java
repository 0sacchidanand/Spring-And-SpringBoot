package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(App.class, args);
	Student s= context.getBean(Student.class);
	System.out.println(s);
	}

}
