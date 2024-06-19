package switchcase;

public class Bubblesort2222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//if(arr[j]>arr[j+1])   //ascending
		//if(arr[j]<arr[j+1])   //descending
			
			
		
		
		
		
		int[] arr= {5, 10, 4, 6, 90, 34, 28};
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		
		
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		
		
		
//		4
//		5
//		6
//		10
//		28
//		34
//		90


	}

}
