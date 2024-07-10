package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatewords {

	
	public static void main(String[] args) {
		
		
		
		String str= "this is java java pretty language";
		
		String[] arr=str.split(" ");
		
		Set<String>st=new LinkedHashSet<String>();                 
	
							
			for(int i=0;i<=arr.length-1;i++)
			{
				st.add(arr[i]);
			}
			
				
			for(String s:st)
			{
				//System.out.println(s);
				System.out.print(s + " ");
			}
		
		
	}
	
	
	/*
	this
	is
	java
	pretty
	language
     */
	
	//this is java pretty language    
	
}
