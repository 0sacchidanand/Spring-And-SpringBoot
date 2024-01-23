package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
	private JdbcTemplate j;

	public void setJ(JdbcTemplate j) {
		this.j = j;
	}
	public int insertStudent(Student s)
	{
		String sql="insert into Student(sname,scity,spercentage)value(?,?,?)";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}
}
