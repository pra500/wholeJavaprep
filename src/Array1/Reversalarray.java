package Array1;

public class Reversalarray {

	public static void main(String[] args) {
	
		
		
		//Reverse an Array: //below ll work for both - sorted /unsorted array:
		//int[] arr= {10, 20, 30, 40, 50};
		
		int[] arr= {50, 20, 30,33, 40, 10};

		
		int n=arr.length;
		int temp, start=0, end=n-1;
		
		
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			
			start++;
			end--;
			
		}
		
		for(int j=0;j<=n-1;j++)
		{
			System.out.println(arr[j]);
		}
		
				
		//50, 40, 30, 20, 10
		//10, 40, 33, 30, 20, 50
		
		
	}

}
