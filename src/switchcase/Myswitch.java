package switchcase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Myswitch {

	public static void main(String[] args) {
		
		
		
		/*
		int i=10;
		
		switch(i)
		{
		case 1:
			System.out.println("hello");
			break;
		case 2:
			System.out.println("wor");
			break;
		case 10:
			System.out.println("wel");
			break;
		default:
			System.err.println("enter");
		*/
		
		
		// need to chk below 
		/*
		String str="pragti";
		
		switch(str)
		{
		case "pragti":
			System.out.println(1);
			
		case "gaurav":
			System.out.println(2);
		case "prachi":
			System.out.println(3);		
			
		default:
			System.out.println("name");
			/*
			1
			2
			3
			name
*/
		
			
		/*
		int a=10;
		
		
		if(a==10)
		System.out.println("ee");
		else if(a==20)
			System.out.println("eee");
		else if(a==30)
			System.out.println("ff");
		*/
			
				
		
	/*
		int a=50;
		if(a==50)
	    System.out.println("f");
		else if(a==30)
			System.out.println("ffff");
		else if(a==60)
			System.out.println("dd");
		else
			System.out.println("pppp");
	*/
		
		
		
		
	/*
	 * char st='c';
	 * 
	 * 
	 * switch(st) { case 'c': System.out.println("k"); break;
	 * 
	 * case 'g': System.out.println("ddd"); break; case 'l':
	 * System.out.println("r"); break;
	 * 
	 * }
	 */
		
	
		
		/*
		String str="pragti pragti gupta is is a good";
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
		
		                         
		Set<Map.Entry<String, Integer>>sdet=map.entrySet();
		
		for(Map.Entry<String, Integer>m:sdet)
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey() + " " + m.getValue());
			}
			else
			{
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}
		
		*/
		
	
		/*
		int a=10;
		int b=20;
		if(a==10 && b==20)
		System.out.println("f");
		else 
		System.out.println("d");
		*/
			
		
		
		/*
		
    //star pattern:
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		
//		* 
//		** 
//		*** 
//		**** 
//		***** 

		System.out.println("--------------------------");
		
		
		
		
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
			
		
		
	
//		
//		***** 
//		**** 
//		*** 
//		** 
//		* 
//			
			
	
	*/		
	
		
		/*
		
		//fibbonica series:
		
		//Scanner snc=new Scanner(System.in);
		
		
	int n=10, fir=0, sec=1, newnum;
	
	for(int i=0;i<=n-1;i++)
	{
		System.out.println(fir);
		
		
		newnum=fir+sec;
		fir=sec;
		sec=newnum;
		
	}
	
	*/
		
//		
//	0
//	1
//	1
//	2
//	3
//	5
//	8
//	13
//	21
//	34

			
			
		
		
	
	
	
	

		
		
		
		
		
			}

}
