package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao sd = context.getBean(StudentDao.class);
        
        Student s= new Student();
        s.setSname("Sachin");
        s.setScity("Pune");
        s.setSpercentage(96.23);
        System.out.println(sd.insertStudent(s));
    }
}
