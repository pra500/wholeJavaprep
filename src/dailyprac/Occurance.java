package dailyprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="pragtiig";
		
		char[] arr=str.toCharArray();
		
		Map<Character, Integer>map1=new HashMap<Character, Integer>();
		
		for(Character c:arr)			
		{
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
			}
			else
			{
				map1.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>>set1=map1.entrySet();
		
		for(Map.Entry<Character, Integer>mm:set1)
		{
			if(mm.getValue()>1)
			{
				System.out.println(mm.getKey() + " " +mm.getValue());
			}
		}
	
		
		
				
		
		
		
		
	}

}
