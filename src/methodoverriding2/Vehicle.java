package methodoverriding2;




class Vehicle1
{
	
	
	
	public void set()
	{
		System.out.println("run");
	}
	
	
}



class Vehicle2 extends Vehicle1
{
	
	
	
}





public class Vehicle {

	public static void main(String[] args) {
		
		Vehicle2 v2=new Vehicle2();
		v2.set();   //run  
		
		
		//benefit - automatically parent things come in child thing
		
		
		

	}

}
