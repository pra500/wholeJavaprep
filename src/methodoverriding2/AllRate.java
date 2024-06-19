package methodoverriding2;


//benefit: reusability of code for ex. bank class

class Bank
{
	public void interest()
	{
		System.out.println("get 10%");
	}
}
	
class SBI extends Bank
{
	public void interest()
	{
		System.out.println("get 8%");
	}
}



class ICICI extends Bank
{
public void interest()
{
	System.out.println("get 9%");
}
}

class PNB extends Bank
{
public void interest()
{
	System.out.println("get 5%");
}
}


public class AllRate {

	public static void main(String[] args) {
		
		//Bank b1=new Bank();    
		//b1.interest();  //get 10%
		
		
		SBI sb=new SBI();
		sb.interest();    //get 8%
		
		
		ICICI ic=new ICICI();
		ic.interest();    //get 9%
		
		
		
		PNB  pb=new PNB();
		pb.interest();    //get 5%		
		
		
		
		

	}

}
