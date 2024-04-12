package staticprac;

public class Child {
	
	
	static int a;
    static int b;
    
    
    int c;
    
    
    
    public static void get()
    {
    	a=10;
    	System.out.println(a);  
    	
    }
	
    
    public static void gett()
    {
    	b=20;
    	System.out.println(b);
    }
	
    
    public void ww()
    {
    	c=90;
    	System.out.println(c);
    	
    	
    }
	
    public void wwi()
    {
	
    	System.out.println(a);
    	
    }	
    
    
    
    
    
		
	public static void main(String[] args) {
		
		
		 Child c=new Child();
		 
		 
		 Child.get();      //10
		 Child.gett();     //20
		 
		  
		 c.ww();         //90
		 c.wwi();        //10
		 
		 
	}

}
