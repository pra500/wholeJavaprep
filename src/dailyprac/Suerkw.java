package dailyprac;

public class Suerkw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str="I Am Not String";
		
		
		char[] arr=str.toCharArray();
		char[] arr1=new char[arr.length];
		
		
		for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i] == ' ')
				{
					arr1[i]=' ';
				}
					
			
				int j=arr1.length-1;
				
			
				for(int m=0;m<=arr.length-1;m++)
				{
					if(arr[i] != ' ')
					{
					
					  if(arr1[j] == ' ')
					  {
						  j--;
					  }
					  
					  
					  
					  arr[j]=arr[i];
					  j--;
				}
			      
					
					System.out.println(String.valueOf(arr1));
				
			
			}
		}
	

	}
}	
	
	

