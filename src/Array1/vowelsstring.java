package Array1;

import java.util.ArrayList;

public class vowelsstring {

	public static void main(String[] args) {
		
	String str="pyuioajk";		
	int count=0;
	
	
	for(int i=0;i<=str.length()-1;i++)
	{
		
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		{
			System.out.println(str.charAt(i));
			count++;
			
		}
	}
 
	
	System.out.println(count);

	}		
	
	
	
//	
//	u
//	i
//	o
//	a
//	4
	
	


}
