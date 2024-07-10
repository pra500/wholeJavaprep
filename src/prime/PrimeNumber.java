package prime;

public class PrimeNumber {
	
	
	public static boolean b(int num)
	{
		if(num<=1)
		{
			return false;	
			
		}
		
		for(int  i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		
		
		return true;		
		
	}	
	
	
	public static void getdata(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(b(i))
			{
				System.out.print(i + " ");
			}
		}
		
	}
	public static void main(String[] args) {
				
		
	//System.out.println("this is prime number " + b(4));    //false
	//System.out.println("this is prime number " + b(41));    //true		
	//System.out.println("this is prime number " + b(23));  //true
	
	
		
		//WAP to print prime no from 1 to 20:
		
		//getdata(10);  //2 3 5 7 
		
		getdata(20);  //2 3 5 7 11 13 17 19 
								
	}

}
