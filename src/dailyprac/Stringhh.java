package dailyprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stringhh {

	public static void main(String[] args) {
		
		
		
		//for-each loop:
		
		
		/*
		
		int[] arr= {5,8};
	for(int c:arr)
	{
		System.out.println(c);
	}
	
	
	
	/*	
		
	
	String[] arr= {"java", "c++"};
	
	for(String s:arr)
	{
		System.out.println(s);
	}
	
	*/
	
	
	
	/*
	char[] t= {'h', 'j'};
	
	for(char c:t)
	{
		System.out.println(c);
	}
	*/
	
	
	
	
		
		String str="java is java is a good";
		
		String[] arr=str.split(" ");
		
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		for(String s:arr)
		{
			if(map.containsKey(s))
			{
				
				map.put(s, map.get(s)+1);		
				
			}
			
			else
			{
				map.put(s, 1);
				
			}
			
		}
		
		
	      Set<Map.Entry<String, Integer>> set1=map.entrySet();
	      
	      for(Map.Entry<String, Integer> mm:set1)
	      {
	    	  if(mm.getValue()>1)
	    	  {
	    		  
	    		  System.out.println(mm.getKey() + " " +mm.getValue());
	  
	    		  
	    		  
	    	  }
	      }
	    	  
	    	  
	    	  
	      
	
		
	
	
	
	
		
		
		
	
	


	}

}
