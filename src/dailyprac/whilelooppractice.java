package dailyprac;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class whilelooppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//while loop:
		
		//we can use break in while loop, 
		
		/*
		int i=0;
				
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		
//		
//		int a=15;
//		
//		while(a<=20)
//		{
//			System.out.println("he");
//			a++;
//			
//			
//		}
	   
		
		
//		int a=54;
//		while(a>=52)
//		{
//			System.out.println("welcome");
//			a--;
//		}
//		
		
		/*
		int i=1;
//		
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//			break;
//		}
		
		
		
		
        //infinite loop
		while(i<=10)
		{
			System.out.println(i);
		
		}
		
		*/
		
		
		//find the Maximum Occurring Character in a String:
		/*
		
		String s="abbccc";
		
		int[] arr=new int[127];
		
		for(int i=0;i<=s.length()-1;i++)
		{
			
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		
		
		
	int max=-1;
	char c=' ';
	
	for(int i=0;i<=s.length()-1;i++)
	{
		
		max=arr[s.charAt(i)];
		c=s.charAt(i);
		
		
				
		
	}
		
	System.out.println("Maximum Occurring Character is "+c);			
	*/
		
		
 //Remove Duplicate Characters In String:       (every char should come only one time for ex, ppragtipi - pragti, abcbc - abc , w3resource-w3resouc)
		/*
		
		String str="ppragtipi";	 //pragti
		
		StringBuilder sb=new StringBuilder();
		
		Set<Character> set1=new LinkedHashSet();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			set1.add(str.charAt(i));
		}
		
	for(Character c:set1)
	{		
		sb.append(c);
		
	}
	
		System.out.println(sb);
		*/
		
		
		
		//both below correct:	
		/*
		int[] a= new int[] {10,20, 30,40};
	    int[] b= {10,20, 30,40};
	    */
		
		
				
		
	    
	    //we can use break in both - while and for loop
		
		
	    
	   //Reverse an Array:
		
	    
	    int[] arr= {12, 13, 14, 15, 16};
	    	   
	    int n=arr.length;
	    int temp, start=0, end=n-1;
	    
	    
	    while(start<end)
	    {	    	
	    	
	    	temp=arr[start];
	    	arr[start]=arr[end];
	    	arr[end]=temp;
	    	
	    	
	    start++;
	    end--;
	    
	    	
	    }
	   
	    for(int j=0;j<=arr.length-1;j++)
	    {
	    
	 System.out.println(arr[j]);
	    
	    }

	    
	    

//	    
//	    16
//	    15
//	    14
//	    13
//	    12
	      
	    
		
		
		
		
		

	}

}
