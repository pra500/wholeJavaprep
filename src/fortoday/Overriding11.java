package fortoday;



class Run
{
	
	public void get()
	{
		System.out.println("dd");
	}
}


class Runn extends Run
{
	
	public void get()
	{
		System.out.println("dd --   ss");
	}
}


public class Overriding11 {	
	
	public static void main(String[] args) {
		
		
		
		Run r=new Run();
		r.get();
		
		
		Runn r1=new Runn();
		r1.get();
		
		
	}

}
