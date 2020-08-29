package com.java.model;

import java.util.Map;

public class Employees {
	

	private String employeeName;
	private String employeeId;

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(String employeeName, String employeeId) {
		this.employeeName =employeeName ;
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
