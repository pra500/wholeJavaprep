package dailyprac;

public class Allpermutationofstring {
	
	
	
	
	public static void permute(int index, String str)
	{
		
		//base:		
		if(index==str.length()-1)
		{
			System.out.println(str);
			return;
		}
		
		
		//main logic:
		for(int i=index;i<=str.length()-1;i++)
		{
			
			//swap
			str=swap(str, i, index);
			
			//recursion
			
			permute(index+1, str);
			
			
			//backtracking
			str=swap(str, i, index);
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	

	public static String swap(String sss, int a, int b)
	{
		
		char[] ch=sss.toCharArray();
		
		
		char p=ch[a];
		ch[a]=ch[b];
		ch[b]=p;
		
		return String.valueOf(ch);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		
		permute(0, s);
		
//		
//		abc
//		acb
//		bac
//		bca
//		cba
//		cab
		
		


	}

}
