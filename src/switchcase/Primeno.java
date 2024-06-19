package switchcase;

public class Primeno {
	
	//2 is the lowest prime no

	public static boolean isPrimeNumber(int num) {

		
		
		
		//we cover edge/corner cases
		if(num<=1)
		{
			return false;
		}
		
		
		
		
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
		
	return true;
			
		

	}

	public static void main(String[] args) {

		
		System.out.println("7 is prime no " + Primeno.isPrimeNumber(7));
		System.out.println("17 is prime no " + Primeno.isPrimeNumber(17));
		System.out.println("14 is prime no " + Primeno.isPrimeNumber(14));
		System.out.println("20 is prime no " + Primeno.isPrimeNumber(20));
		
		
	
	}

}
