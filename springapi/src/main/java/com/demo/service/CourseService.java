package com.demo.service;

import java.util.List;

import com.demo.entites.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long coursId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
}
