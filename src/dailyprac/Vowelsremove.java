package dailyprac;

public class Vowelsremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		String str="pragPRiouOU";
		str=str.toLowerCase();
		
		String str1=str.replaceAll("[aeiou]", "");
		System.out.println(str1);         //prgpr
		*/
		
		
		
		
		
		
		/*
		
		//ll chk below later 
				
	
		String s="pragPRiouOU";
		s=s.toLowerCase();
		 
	        for (int i = 0; i < s.length(); i++) { 
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
	                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
	                || s.charAt(i) == 'u' 
	                ) { 
	                continue; 
	            } 
	            else { 
	                System.out.print(s.charAt(i));    //prgpr
	            } 
	        } 
 
	        */
	        
	        
	        
	        //ll chk later below:
		
		
	        String s="pragPRiouOU";
	        
			 
		        for (int i = 0; i < s.length(); i++) { 
		        	if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
		                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
		                    || s.charAt(i) == 'u' || s.charAt(i) == 'A'
		                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
		                    || s.charAt(i) == 'O'
		                    || s.charAt(i) == 'U') {
		        	
		                continue; 
		            } 
		            else { 
		                System.out.print(s.charAt(i));    //prgPR
		            } 
		        } 
	 
	}

}
