package com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.model.ModelData;

@Component
public class CallRestService implements  CommandLineRunner{

	private static void callRestService()  {
		
		RestTemplate restTemp = new RestTemplate();
		ModelData person = restTemp.getForObject("http://localhost:8081/person", ModelData.class);
		restTemp.setErrorHandler(null);
		System.out.println("Person's name is : "+person.getFirstName());
	}

	@Override
	public void run(String... args) throws Exception {
		
		callRestService();
	}
	
	
}
