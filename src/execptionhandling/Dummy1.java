package execptionhandling;

public class Dummy1 {

	
	//Error e
	//u must use "try-catch"   -  with throws/throw/custom exception for going ahead in pgm; for all things u must use try-catch
	//all selenium exceptions are unchecked exceptions ?
	
				
	
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("abc");
		
		try
		{
		int a=10;
		int c=a/0;
		System.out.println(c);		
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		try
		{
		throw new Exception("Pragti Exception");
		}
		
		
		catch(Exception e)		
		{
			//e.getMessage();			
			e.printStackTrace();
		}
		
		System.out.println("xyz");		
		System.out.println("xyz");		
		System.out.println("xyz");

		
		
		}

	
	//if we use e.getMessage(); in line 37
	/*
	 *abc
java.lang.ArithmeticException: / by zero
	at execptionhandling.Dummy1.main(Dummy1.java:20)
xyz
xyz
xyz

	 * 
	 * 
	 */
	
	
	
	//if we use e.printStackTrace(); in line 37
	/*
	 * abc
java.lang.ArithmeticException: / by zero
	at execptionhandling.Dummy1.main(Dummy1.java:20)
java.lang.Exception: Pragti Exception
	at execptionhandling.Dummy1.main(Dummy1.java:31)
xyz
xyz
xyz

	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
