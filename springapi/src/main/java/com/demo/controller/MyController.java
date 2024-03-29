package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entites.Course;
import com.demo.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return " Welcome to courses application"; 
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//get single course
	@GetMapping("/course/{courseId}")
	public Course getCourse (@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	//course add
	@PostMapping("/courses")
	public Course addCourses(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	//update course
	@PutMapping("/courses")
	public Course updateCourses(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
}
