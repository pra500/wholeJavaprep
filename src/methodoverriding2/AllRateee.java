package methodoverriding2;


class Vehi
{
	
	
	
}


class Vehi1 extends Vehi
{
	
	
	public void gett()
	{
		System.out.println("wo");
	}
}



public class AllRateee {	

	public static void main(String[] args) {
		
		Vehi1 vv=new Vehi1();
		vv.gett();   //wo	
		
		
		
 
	}

}
