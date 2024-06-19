package switchcase;

public class Bubblesort {

	public static void main(String[] args) {
			
		
		//int[] arr= {13, 19, 10, 8};
		
		//int temp;
		
		
		/*
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-i-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
							
				}
			}
		}
		
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		*/
			
	
		
		//need to chk again:
		
		
		  int[] arr= {13, 19, 10, 8};
		  
		  
		
			
	
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=1;j<arr.length-1;j++)
			{
				
				if(arr[j-1]>arr[j])
				{
									
					
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		
		
for(int i=0;i<arr.length-1;i++)
{
	System.out.println(arr[i]);
}
		
	}

}
