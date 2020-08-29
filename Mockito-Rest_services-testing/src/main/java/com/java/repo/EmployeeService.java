package com.java.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.Employees;
@Service
public class EmployeeService {

	
	public List<Employees> employeList = new ArrayList<>(Arrays.asList(new Employees("naveen", "143"),
			new Employees("mouni", "143"),
			new Employees("munny", "143")));
	
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeList;
	}

	public void addEmployee(Employees employee) {
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeName());
		
		
		employeList.add(employee);
		
	}

	
}
