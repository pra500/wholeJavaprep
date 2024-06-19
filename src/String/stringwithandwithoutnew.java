package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class stringwithandwithoutnew {

	public static void main(String[] args) {
		
		//without new , content same  - heap, object ll be one, multiple references, should be exact same not jAva/JavA anything
		//with new ,  content same  - pool, object ll be multiple, multiple references
		//heap - outside, pool - inside 
		
		
		//heap always big, pool always small
		
		//need to chk notes again
				
		
		
		
		/*
		
		 String str1="java";
		 String str2=new String ("java");		 
		 String str3="java";		 
		 String str4=new String ("java");
		 String str5="Java";
		 
		 /*
		 if(str1==str2)
			 System.out.println("are eq");     
		 else
			 System.out.println("not eq");   //not eq
		 
		 
		 
		 if(str1==str3)
			 System.out.println("are happy");  //are happy
		 else
			 System.out.println("not happy");
		 
			 	
		 
		 if(str2==str4)
			 System.out.println("are same");   
		 else
			 System.out.println("not same");  //not same
		 
		 
		 if(str2==str3)
			 System.out.println("are same");   
		 else
			 System.out.println("not same");  //not same
		 
		 
		 
		 
		 if(str1==str5)
			 System.out.println("are same");   
		 else
			 System.out.println("not same");  //not same

		*/ 
		 
		 
		 /*
		 if(str1.equals(str2))
			 System.out.println("are eq");     
		 else
			 System.out.println("not eq");   //are eq
		 
		 
		 
		 if(str1.equals(str3))
			 System.out.println("are happy");  //are happy
		 else
			 System.out.println("not happy");
		 
		 */
		 
		 
		 
		 
		 
		 //sorting a string
		 /*
		 String str="pragti";		 
		char[] arr= str.toCharArray();	
		
		Arrays.sort(arr);
		System.out.println(arr);   //agiprt		
		System.out.println(arr[3]);   //p
		*/
		 
		 
		 
		 
		
		//remove duplicate words in a string:
		 
		 
		 
		 /*
		 String str="pra pra is good girl good ggod";
		 
		String[] arr=str.split(" ");
		
		Map<String>
		*/
		 
		 
		 
		 
		 //print only uppercase/lowercase/disits in a string 
		 
		/*
		 String str="pra45PTY#$%^kl";
		 int count=0;
		 
		 for(int i=0;i<=str.length()-1;i++)
		 {
			 
			 //if(str.charAt(i)>=97 && str.charAt(i)<=122)
				 //if(str.charAt(i)>=65 && str.charAt(i)<=122)
			 
			 if(str.charAt(i)>=48 && str.charAt(i)<=57)
			 {
				 System.out.println(str.charAt(i));
				 count++;
			 }	 
			 
			 
		 }
		 
	System.out.println("total is " +count);
		*/
		
				
	
		 
		 //how to remove junk/unwanted/special chars in a string:
	
		 //regular expression
		 
	
		 // String str="pra45PTY#$%^kl";
		
		
		 //str=str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(str); 
		  
		 // String syy=str.replaceAll("[^a-zA-Z0-9]", "");
		  //System.out.println(syy);  //pra45PTYkl
		  
		
		//System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));  ////pra45PTYkl
		
		//pra45PTYkl
		
		//String ttt="This#string%contains^special*characters&.";
		  
		  
		  String str= "This#string%contains^special*characters&."; 
		  
		  
		  //always select this one -   replaceAll(String regex, String replacement);
		  
		  
		  
		  str=str.replaceAll("[^a-zA-Z0-9]","");
		  System.out.println(str);   //Thisstringcontainsspecialcharacters
		  
	
		
		//need to chk space thing
		  String str7= "This# string %conta kk";
		  str7=str7.replaceAll("[^a-zA-Z0-9 ]","");
		  System.out.println(str7); 
		
	
		  
		  
		  
		  
		
		
		
		 

	}

}
