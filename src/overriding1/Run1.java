package overriding1;


class Run2
{
	
	
	public void get()
	{
		System.out.println("hello");
	}
	
	
	

	public static void geti()
	{
		System.out.println("world");
	}
}


class Run3 extends Run2
{
	public void get()
	{
		System.out.println("hello1");
	}
	
	
	

	public static void geti()
	{
		System.out.println("worldfame");
	}

	
	
}




public class Run1 {	
	
	

	public static void main(String[] args) {
		
		
		
		//Run2 r2=new Run3();
		//r2.get();  //hello1

		
		/*
		Run2 r2=new Run3();
		Run3 r3= (Run3) r2;
		
		r3.get();   //hello1
		
		*/
		
		
		
		
		
		Run2 r2=new Run3();
		r2.geti();    //world

		
		
		
		
		
		
	}

}
