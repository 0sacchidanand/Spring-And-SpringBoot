package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;
import com.demo.model.EmployeeRowMapper;

@Repository
public class EmployeedaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate j;

	@Override
	public int insertEmployee(Employee e) {
		String sql="insert into employee(ename,edesignation,ecompany,esalary)values(?,?,?,?)";
		return j.update(sql,new Object[] {e.getEname(),e.getEdesignatation(),e.getEcompany(),e.getEsalary()});
		
	}
	@Override
	public int deleteEmployeeByid(int eid) {
		String sql="delete from employee where eid=?";
		return j.update(sql,eid);
	}
	@Override
	public Employee findEmployeeByEid(int eid) {
		String sql="select eid,ename,edesignation,ecompany,esalary from Employee where eid=?";
		
		Employee e= null;
		List<Employee>list = j.query(sql, new EmployeeRowMapper(),eid);
		if(!list.isEmpty())
			e=list.get(0);
		return e;
		
	}
	@Override
	public List<Employee> findAllEmployee() {
		String sql="select eid,ename,edesignation,ecompany,esalary from Employee";
		return j.query(sql, new EmployeeRowMapper());
	}
	@Override
	public int updateEmployee(Employee e) {
		String sql="update Employee set ename=?,edesignation=?,ecompany=?,esalary=? where eid=?" ;
		return j.update(sql,new Object[] {e.getEname(),e.getEdesignatation(),e.getEcompany(),e.getEsalary(),e.getEid()});
		
	}

}
