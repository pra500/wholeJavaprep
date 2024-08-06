package Array1;

public class Multicatchblock {
	
	public static void main(String[] args) {
		
		System.out.println("starting");
		
		try
		{
			//String s=null;
			int a=17/0;
			
			System.out.println("starting1");
			
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(NullPointerException e)
		{
			
			e.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			e.getMessage();
			
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
		
		finally
		{
			
			System.out.println("ended");
		}
		
		
		System.out.println("whole end");
		

		
		
		
		
		/*
		
		starting
		java.lang.ArithmeticException: / by zero
			at Array1.Multicatchblock.main(Multicatchblock.java:12)
		ended
		whole end

		*/
		
		
	}

}
