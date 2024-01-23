package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
private int sid;
private String sname;
private String scity;
private double spercentage;
@Autowired
private Address address;

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
			+ ", address=" + address + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getScity() {
	return scity;
}
public void setScity(String scity) {
	this.scity = scity;
}
public double getSpercentage() {
	return spercentage;
}
public void setSpercentage(double spercentage) {
	this.spercentage = spercentage;
}
}
