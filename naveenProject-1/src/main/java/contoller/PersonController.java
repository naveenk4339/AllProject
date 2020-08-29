package contoller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import Service.ServiceLayer;
import model.ModelData;

@RestController
public class PersonController {
	
	@Autowired
	ServiceLayer sc; 
	
	public Hashtable<String, ModelData> getAll(){
		return sc.getAll();
	}
	
	/*
	 * public ModelData getPersonInfo(@Path) {
	 * 
	 * }
	 */
}
