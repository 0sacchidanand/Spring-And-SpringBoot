package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entites.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course>list;
	
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(1,"Java","This code contain basics of java"));
		list.add(new Course(2,"Spring Boot","Spring boot courses"));
	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long coursId) {
		
		Course c= null;
		for(Course course:list) {
			if(course.getId()==coursId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		list.add(course);
		return course;
	}
	

}
