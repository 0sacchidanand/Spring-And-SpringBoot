package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    	
    	Student s1= context.getBean("student",Student.class);
    	//Student s2 = context.getBean(Student.class);
    	System.out.println(s1);
    }
}
