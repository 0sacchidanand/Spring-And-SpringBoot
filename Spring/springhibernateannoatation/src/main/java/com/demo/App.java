package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;
import com.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        StudentService ss = context.getBean(StudentService.class);
        Student s= new Student();
        s.setSname("Bhavesh");
        s.setScity("Sangli");
        s.setSpercentage(60.30);
        System.err.println(ss.insertStudent(s));
    }
}
