package com.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.java.modal.GroceryModelData;

public class InventoryService {
	
	
	List<GroceryModelData> groceryList = new ArrayList<>(Arrays.asList(new GroceryModelData("400", "500", "300", "30"),
			new GroceryModelData("400", "500", "300", "30"),
			new GroceryModelData("400", "500", "300", "30")));
	List<GroceryModelData> inv = new ArrayList<>(Arrays.asList(new GroceryModelData("400", "500", "300", "30"),
			new GroceryModelData("400", "500", "300", "30"),
			new GroceryModelData("400", "500", "300", "30")));
	
	public List<GroceryModelData> inventoryList() {
		
		
		return groceryList;
		
	}

}
