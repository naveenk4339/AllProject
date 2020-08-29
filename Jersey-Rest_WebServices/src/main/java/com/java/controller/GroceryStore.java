package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.java.modal.GroceryModelData;
import com.java.service.InventoryService;

@XmlRootElement(name="GroceryModelData")
@Path("/groceryStore")
public class GroceryStore {

	
	InventoryService inventoryService;
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("/naveen")
	public String sayPlainTextHello() {
		return "Hello World RESTful Jersey!";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<GroceryModelData> getStoreInventory() {

		List<GroceryModelData> list = inventoryService.inventoryList();
		System.out.println("sizw" + list.size());

		return list;
	}
	 
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Path("/create")
	public void createInventory(@FormParam("id") String id) throws IOException {

		System.out.println(id);
	}
	
	
	
}
