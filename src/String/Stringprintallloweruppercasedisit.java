package String;

public class Stringprintallloweruppercasedisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		String str="prag789LPI";
		StringBuilder sb=new StringBuilder();
		/*
		
		//print all lowercase 
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb); //prag
		*/
		
		/*
		//print all uppercase 	
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb);  //LPI
*/
		
		
		//print all disits
		
		for(int i=0;i<=str.length()-1;i++)			
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				sb.append(str.charAt(i));
			}	
			
		}
		
		
		System.out.println(sb);  //789
				
		
		
	
	}
}
