package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        StudentDao sd =context.getBean(StudentDao.class);
//        Student s = new Student();
//        s.setSname("Parth");
//        s.setScity("Parbhani");
//        s.setSpercentage(99.99);
//        System.out.println(sd.insertStudent(s));
        
        //System.out.println(sd.deleteStudent(10)); //  delete quary
        
//        Student s= sd.findStudentBySid(2);
//        System.out.println(s);
        
//        for(Student s:sd.findAllStudent())
//        	System.out.println(s);
        
        Student s= sd.findStudentBySid(2);
        s.setSname("Santosh");
        System.out.println(sd.updateStudent(s));
    }
}
