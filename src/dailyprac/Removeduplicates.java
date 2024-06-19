package dailyprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//How to remove all duplicates from a given string / how to find unique char in a string:
		
		
String str="pragtiig";
		
		char[] arr=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		for(Character c:arr)
		{ 
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,  1);
			}
		}
		
	
		Set<Map.Entry<Character, Integer>>s=map.entrySet();
		for(Map.Entry<Character, Integer>m1:s)
		{
			if(m1.getValue()==1)
			{
				//System.out.println(m1.getKey() + " " +m1.getValue());
				System.out.print(m1.getKey());   //part
			}
		}		
			
			
			
			
			

	}

}
