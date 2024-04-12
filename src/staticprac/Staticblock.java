package staticprac;

public class Staticblock {
	//we can ve one/more static blk, sequencially they ll run
	
	
	static
	{
		System.out.println("world");
	}
	
	static
	{
		System.out.println("world2");
	}
	
	
	static
	{
		System.out.println("world3");
	}
	
	
	static int a=10;
	static int b=20;
	
	
	public static void get()
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int bb=Staticblock.a;
		System.out.println(bb);   
		
		
		int bb1=Staticblock.b;
		System.out.println(bb1);
		
		
		
		Staticblock.get();
		
		
		
		/*world
		 * 10
		 * 20
		 * 30
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		/*world
world2
world3
10
20
30

		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		

	}

}
