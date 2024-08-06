package trycatchfinallypractice;

public class prac111 {
	
	public static void main(String[] args) {
		
		
		try
		{
			int y=45/0;
			String s=null;
			
			
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("cffff");
		
		
		/*
		java.lang.ArithmeticException: / by zero
		at trycatchfinallypractice.prac111.main(prac111.java:10)
	cffff
	*/
			
		

		
	}

}
