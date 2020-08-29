package io.java.springbootstarter;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		Company comp = new Company();

		/*
		 * List<Manager> managerList = new ArrayList<Manager>(); for (Manager em :
		 * comp.managers) { managerList.add(em);
		 * 
		 * }
		 * 
		 * List<Employee> emps = new ArrayList<Employee>(); for (Manager em :
		 * managerList) { emps.;
		 * 
		 * }
		 * 
		 * Employee test = new Employee(); List<String> a = test.address1;
		 */

	}
	



	
}

class Company {
	List<Manager> managers;

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	
}
class Manager {
	List<Employee> employees;
	Company comp = new Company();
	List<Manager> managersList = comp.managers;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
class Employee {
	List<String> address1;
    Manager manager;
   
    
   List<Manager> empManager = manager.managersList;
	public List<String> getAddress1() {
		return address1;
	}

	public void setAddress1(List<String> address1) {
		this.address1 = address1;
	}

}


