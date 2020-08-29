package com.controller;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping
	public String getInfo() {
		return "Hello World";
	}
	
	@RequestMapping("/allList")
	public List<ModelData> getAllList() {
		return sc.getAllList();
	}

	@RequestMapping("{id}")
	public ModelData getPersonInfo(@PathVariable("id") String id) {
		System.out.println(id);
		return sc.getModelData(id);

	}
	
	@RequestMapping("/{userId}")
	public List<ModelData> getCatalog(@PathVariable("userId") String id) {
		
		return Collections.singletonList( new ModelData());

	}
	
}
