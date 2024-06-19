package overloading;



//overloading possible within one class


class Runww
{
	
	public void set()
	{
		System.out.println("hello");
	}
	
	
	public void set(int a)
	{
		System.out.println(a);
	}
	

	public void set(int a, int b)
	{ 
		int c=a+b;
		System.out.println(c);
	}
	
	
}




public class Shape {

	public static void main(String[] args) {
		
		Runww r=new Runww();
		
		r.set();
		r.set(12);
        r.set(2, 6);
        
        
        
        
     
        
        
        
		
		


	}

}
