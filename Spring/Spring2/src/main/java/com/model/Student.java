package com.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Student {
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	private List<String> hobbies = new LinkedList();
	private Map<String,String> details = new TreeMap();
	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
				+ ", hobbies=" + hobbies + ", details=" + details + ", address=" + address + "]";
	}

}
