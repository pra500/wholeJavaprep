package mastek;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapIterationmultiways {
	
	
	public static void main(String[] args) {
		
		
//using for each loop:
		
	
	Map<String, Integer> hm = new HashMap<String, Integer>();
	
	hm.put("age", 12);
	hm.put("roll", 22);
	hm.put("depttno", 34);
	
	
	for(Map.Entry<String, Integer> mm:hm.entrySet())
	{
		System.out.println(mm.getKey() + " " + mm.getValue());
	   
	}
	
	int age=hm.get("age");
	System.out.println(age); //12
	
	
	int roll=hm.get("roll");
	System.out.println(roll); //22
	
	
//	
//	roll 22
//	depttno 34
//	age 12
 

		
	
/*		
//using Iterator:
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("age", 12);
		hm.put("roll", 22);
		hm.put("depttno", 34);
		
		
		  Iterator<Map.Entry<String, Integer>>itr=hm.entrySet().iterator();
		  
		  while(itr.hasNext())
		  {
			  Map.Entry<String, Integer>mm=itr.next();
			  
			  System.out.println(mm.getKey() + " " + mm.getValue());
			  
		  }
	
	
//	
//		  roll 22
//		  depttno 34
//		  age 12
//
	
	*/
		
	}

}
