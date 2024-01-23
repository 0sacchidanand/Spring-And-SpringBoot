package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.model.StudentRoMapper;

@Component
public class StudentDao {
	@Autowired
	private JdbcTemplate j;
	
	public int insertStudent(Student s)
	{
		String sql = "insert into student(sname,scity,spercentage)values (?,?,?)";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}
	public int deleteStudent(int sid)
	{
		String sql="delete from Student where sid =?";
		return j.update(sql,sid);
	}
	public Student findStudentBySid(int sid)
	{
		String sql = "select sid,sname,scity,spercentage from student where sid=?";
		Student s= null;
		
		List<Student> list =j.query(sql, new StudentRoMapper(),sid);
		
		if(list.size()!=0)
			s=list.get(0);
		return s;
	}
	
	public List<Student> findAllStudent()
	{
		String sql = "select sid,sname,scity,spercentage from student";
		return j.query(sql, new StudentRoMapper());
	}
	
	public int updateStudent (Student s)
	{
		String sql = "update student set sname=?,scity=?,spercentage=? where sid=?";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage(),s.getSid()});
	}
	
}
