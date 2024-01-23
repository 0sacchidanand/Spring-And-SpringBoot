package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Id
	
private int eid;
private String ename;
private String edesignatation;
private String ecompany;
private double esalary;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edesignatation=" + edesignatation + ", ecompany=" + ecompany
			+ ", esalary=" + esalary + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdesignatation() {
	return edesignatation;
}
public void setEdesignatation(String edesignatation) {
	this.edesignatation = edesignatation;
}
public String getEcompany() {
	return ecompany;
}
public void setEcompany(String ecompany) {
	this.ecompany = ecompany;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
}
