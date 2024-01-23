package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	 @Autowired
	private StudentDao sd;

	@Override
	
	public int insertStudent(Student s) {
		return sd.insertStudent(s);
	}
}
