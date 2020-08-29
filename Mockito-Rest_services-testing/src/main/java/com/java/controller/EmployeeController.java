package com.java.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.java.model.Employees;
import com.java.repo.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
 
    @GetMapping(path="/get", produces = "application/json")
    public List<Employees> getEmployees() 
    {
    	System.out.println("test");
        return employeeService.getAllEmployees();
    }
     
    @PostMapping(path= "/post", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employees employees) {       
                 
        //add resource
    	employeeService.addEmployee(employees);
         
		/*
		 * //Create resource location URI location =
		 * ServletUriComponentsBuilder.fromCurrentRequest() .path("/{id}")
		 * .buildAndExpand(employees.getId()) .toUri();
		 */
        //Send location in response
       // return ResponseEntity.created(location).build();
    }
}
