package com.service;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ModelData;

@Service
public class ServiceLayer {

	
	Hashtable<String, ModelData> personDetails = new Hashtable<String, ModelData>();

	List<ModelData> personInfo = new ArrayList<ModelData>();
	
	public ServiceLayer() {
		ModelData md = new ModelData();
		md.setEmpId("3020");
		md.setFirstName("Naveen");
		md.setLastName("Seelam");
		md.setAge(28);
		md.setId(232323);
		personInfo.add(md);
		personDetails.put("1", md);

		md = new ModelData();
		md.setEmpId("3120");
		md.setFirstName("Mouni");
		md.setLastName("Seelam");
		md.setAge(25);
		md.setId(231433);
		personDetails.put("2", md);

	}

	
	public ModelData getModelData(String id) {
		if (personDetails.contains(id)) {
			return personDetails.get(id);
		}
System.out.println("no data ");
		return personDetails.get(id);

	}

	public Hashtable<String, ModelData> getAll() {

		return personDetails;
	}
	public List<ModelData> getAllList() {

		return personInfo;
	}

}
