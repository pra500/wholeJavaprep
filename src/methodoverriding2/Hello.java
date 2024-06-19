package methodoverriding2;

//overriding not possible within one class, it ll not allow u, rename mtd ll show while hovering, inhritance is mandaory, then only
//dat mtd ll call overrided mtd



//overloading possible within one class


class Runww
{
	
	public void set()
	{
		System.out.println("hello");
	}
	
	
	public void setd()
	{
		System.out.println("helloa");
	}
	
		public void sets()
	{
		System.out.println("helloff");
	}
	
	
	
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runww r=new Runww();
		r.set();
		r.setd();
		r.sets();

	}

}
