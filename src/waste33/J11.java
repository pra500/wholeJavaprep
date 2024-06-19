package waste33;




class Run
{
	
	
	public static void mi()
	{
		System.out.println("hello");
	}
}

class Run1 extends Run
{
	
	
	public static void mi()
	{
		System.out.println("hello1");
	}
}


public class J11 {

	public static void main(String[] args) {
	
		
		Run r=new Run();
		r.mi();  //hello
		
		

		Run1 r1=new Run1();
		r1.mi();  //hello1
		

		
		Run r2=new Run1();
		r2.mi();  //hello
	}

}
