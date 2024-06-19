package june14;

import java.util.LinkedHashSet;

public class removeduplicatechar {
	
	public static void main(String[] args) {
		
		
		String str="Pratiai";
		
		
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			set1.add(str.charAt(i));
		}
		
				
		for(Character c:set1)
		{
			System.out.println(c);
		}
	}
	
	/*
	P
	r
	a
	t
	i
	*/

	
}
