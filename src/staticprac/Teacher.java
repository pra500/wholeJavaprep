package staticprac;

public class Teacher {
	
	
	
	private static int x=10;
	
	private static int y=20;
	
	int c=30;
	
	
	
	

	
	public static void fit()
	{
		System.out.println(x);
	}
	
		
	
	public static void fit1()
	{
		System.out.println(y);
	}
	
	 
	public void m1()
	{
		System.out.println(c);
		
		System.out.println(x);
	}
	
	//**********************private public; with static*************
	
	private static void m11()
	{
		System.out.println("helllllo");	
		
		
	}
	
	
	
		
	
	public static void main(String[] args) {
		
		Teacher.fit();   //10
		Teacher.fit1();    //20
		
		Teacher t1=new Teacher();
		t1.m1();    //30 10
		
		
		Teacher.m11();
		
		
		
		
		
		
	}

}


