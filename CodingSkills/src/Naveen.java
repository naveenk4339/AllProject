import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Naveen {
	public static int countPairs(List<Integer> numbers, int k) {
	    
		int countPair=0;
		   Map <Integer,Integer> integerMap = new HashMap<>(); 
		    
		  
		    for(int num: numbers)
		    {
		        integerMap.put(num, integerMap.getOrDefault(num,0)+1);
		    }
		 
		    for (Map.Entry <Integer, Integer> entry: integerMap.entrySet()) 
		    {
		        int elem = entry.getKey();
		        int value = entry.getValue();
		        
		        if(k>0 && integerMap.containsKey(elem+k))
		            countPair++;
		        
		        else if(k==0 && value >1)
		            countPair++;
		        
		    }
		    return countPair;

	}
}
