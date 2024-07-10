package dailyprac;

public class Splitpreparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String  str="test1234";
		
		//System.out.println(str.replaceAll("[^0-9]", ""));
		//str.replaceAll("[^0-9]", "");
		
		
		
		
		/*
		String str="pabc78";
		        String[] a=str.split("a");
		
		        for(String s:a)
		        {
		        	System.out.println(s);
		        }
		
		        
//		        p
//		        bc78

	*/	
		
		
		        String str="pabc78avbnas";
		        String[] a=str.split("a", 2);
		        
		        for(String s:a)
		        {
		        	System.out.println(s);
		        }
		
		        
		       

	}

}
