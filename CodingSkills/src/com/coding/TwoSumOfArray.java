package com.coding;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOfArray {
	public static void main(String[] args) {
		
	int[] nums = {2,7,9,10};
	int target = 9;
	
	twoSum(nums,  target) ;
	
	

	}
	
	
	//brute force method
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j] == target - nums[i])
                {
                	System.out.println(""+nums[j]+" "+ nums[i]);
                   return new int[]{i,j};
                    
                }
            }
            
        }
      throw new IllegalArgumentException("no two sum sol");
    }

	// using Hash table for same as above
	 public int[] twoSumHash(int[] nums, int target) {
	       
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i], i);
	        }
	        for(int j=0;j<nums.length;j++){
	            int result = target - nums[j];
	            if(map.containsKey(result) && map.get(result) != j){
	                return new int[] { j, map.get(result)};
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	 
	 ///
	 public int[] twoSumIn(int[] nums, int target) {
	       
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int j=0;j<nums.length;j++){
	            int result = target - nums[j];
	            if(map.containsKey(result)){
	                return new int[] { j, map.get(result)};
	            }
	            map.put(j, nums[j]);
	        }
	     throw new IllegalArgumentException("No two sum solution");   
	    }
	    
}
