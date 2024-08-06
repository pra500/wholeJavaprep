package waste;

public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			String s=null;
			
			if(s.equals("gupta"))
			{
				
				System.out.println("hello world");
			}
			else
			{
				System.out.println("not hello world");
			}
						
			

		}
		
		
		catch(ArithmeticException e)		
		{
		e.printStackTrace();
			
		}
		
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
		catch(Exception e)
		{
		
			e.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("thossis");
		}
		
		
		
		
		/*
		
		java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s" is null
		thossis
			at waste.Multicatch.main(Multicatch.java:14)
 
*/
		
				
	}

}
