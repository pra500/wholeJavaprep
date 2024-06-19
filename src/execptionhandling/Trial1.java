package execptionhandling;

public class Trial1 {
	
    int a=10;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("abcc");
		try
		{
		int a=10;
		
		Trial1 t1=new Trial1();
		t1=null;
		System.out.println(t1.a);    //java.lang.NullPointerException 
		
		}
		
		//catch(Exception e)
		catch(Error e)
		{
			e.printStackTrace();
		}
		
		
		
	System.out.println("pqrr");	
		
		
	//catch(Exception e): 
	/*
	 * 
	 * 
	 * 
	 * abcc
java.lang.NullPointerException: Cannot read field "a" because "t1" is null
	at execptionhandling.Trial1.main(Trial1.java:19)
pqrr



	 */
	
	
	
	
	//catch(Error e):
	/*
	 * 	abcc
	Exception in thread "main" java.lang.NullPointerException: Cannot read field "a" because "t1" is null
		at execptionhandling.Trial1.main(Trial1.java:19)
	 * 
	 * 
	 * 
	 */


	
	
	
	
		
		
		
		

	}

}
