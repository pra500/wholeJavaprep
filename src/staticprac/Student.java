package staticprac;

public class Student {
	
	
	
	
	static int i=10;
	static int a=20;
	
	int b=50;
	
		
	
	public static void get()
	{
		System.out.println("hello");
		
		
	}
	
	public static void add()
	{
		int c=i+a;
		System.out.println(c);
		
	}
	
	public void gett()
	{
		System.out.println(b);
		System.out.println(a);
		
	}
		
	
	
	public static void main(String[] args) {	
				
		Student.get();    //hello
		Student.add();     //30
			
		
		Student s1=new Student();
		s1.gett();	  //50 20
				
		
	}

}
