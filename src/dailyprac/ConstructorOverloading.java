package dailyprac;




public class ConstructorOverloading {
	
	public ConstructorOverloading()
	{
		System.out.println("hello");
		
	}
	
	
	public ConstructorOverloading(int t)
	{
		System.out.println(t);
		
	}
	
	public static void main(String[] args) {
		
		
		ConstructorOverloading cc=new ConstructorOverloading();
		ConstructorOverloading cc2=new ConstructorOverloading(12);
		
		
	}
	
	
	
//	
//	hello
//	12


}
