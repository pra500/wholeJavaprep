package trycatchfinallypractice;

public class prac1 {
	
	
	public static void main(String[] args) {
		//printstacktrace() and getMessage() both ll gv diff result,  printstacktrace() ll gv the coming exception
		
		try
		{
			
			 String ptr = null; 
			 if(ptr.equals("pargti"))
			 {
				 System.out.println("hello");
				 
				 
			 }
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
		
		/*
		java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "ptr" is null
		at trycatchfinallypractice.prac1.main(prac1.java:13)
*/	
		
		
	}

}
