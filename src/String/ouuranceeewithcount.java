package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ouuranceeewithcount {
	public static void main(String[] args) {
		
		String str = "aabbbccccddddd";               //a2b3c4d5

		char[] arr = str.toCharArray();
		
		

		Map<Character, Integer> map = new HashMap<Character, Integer>();
				
		
		for(Character c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);		
				
			}
			else
			{
				map.put(c, 1);
			}
		}	
		
		
	Set<Map.Entry<Character, Integer>>set11=map.entrySet();
	
	for(Map.Entry<Character, Integer>m1:set11)
	{
		
		if(m1.getValue()>=1)
		{
			//System.out.print(m1.getKey()+ " " +m1.getValue());    //a 2b 3c 4d 5
			System.out.print(m1.getKey()+ "" +m1.getValue());       //a2b3c4d5
			
		} 
	}
		

	}

}
