package String;

public class prime {
	
	
	
	public static boolean ge(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return  false;
			}
		}
		
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num=19;
		
		
		System.out.println("this is a prime "+ ge(num));

	}

}
