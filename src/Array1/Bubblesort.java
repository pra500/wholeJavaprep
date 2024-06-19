package Array1;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {4, 7, 1};
		
		
		int temp;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
					
				
				
			}
		}
		

		for(int k:arr)
		{
			System.out.println(k);
		}

	}
	
	/*
	1
	4
	7
*/
	
	

}
