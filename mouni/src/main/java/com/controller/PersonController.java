package com.controller;

import java.util.Hashtable;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ModelData;
import com.service.ServiceLayer;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	ServiceLayer sc; 
	
	@RequestMapping("/all")
	public Hashtable<String, ModelData> getAll() {
		return sc.getAll();
	}

	@RequestMapping("{id}")
	public ModelData getPersonInfo(@PathVariable("id") String id) {
		System.out.println(id);
		return sc.getModelData(id);

	}
	 
}
