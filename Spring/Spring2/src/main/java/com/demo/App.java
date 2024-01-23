package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	// Using ApplicationCOntext 
    	
      ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
      
      Student s= context.getBean(Student.class);
      
      System.out.println(s);
//      
//      Student s1 = context.getBean("s2",Student.class);
//      System.out.println(s1);
//      System.out.println(s==s1);
    	
    	//OR
    	// Annotation 
    	
    	/*ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    	Student s1 = context.getBean("s1",Student.class);
    	System.out.println(s1);*/
    	
    	
    	//using XML Bean factory
    	/*Resource r = new ClassPathResource("bean.xml");
    	BeanFactory factory = new XmlBeanFactory(r);
    	Student s= factory.getBean("s1",Student.class);
    	System.out.println(s);*/
    	
    	//Using 
    }
}
