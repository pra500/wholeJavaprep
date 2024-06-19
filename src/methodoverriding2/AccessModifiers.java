package methodoverriding2;


class Run
{
	
	
	public void ge()	
	{
		System.out.println("hh");
		
		
	}
}


class Run1
{
	
	private void ge()	
	{
		System.out.println("hhhhh");
		
		
	}	
	
	
}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Run1 r1=new Run1();
		r1.ge();

	}

}
