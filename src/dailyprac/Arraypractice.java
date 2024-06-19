package dailyprac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraypractice {

	public static void main(String[] args) {
		
		
		//Remove Duplicate Elements from Sorted Array/unsorted array:
		
		
		

  //hashset ll work with both type of array, ll take hashset as it doesn't store duplicate values
		
		
		
		//below for sorted array:		
	/*
		int[] arr= {10, 10,20, 30,40, 40, 50};
		int j=0;
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			
				
				if(arr[i]!=arr[i+1])
				{
					arr[j]=arr[i];
					j++;
				}
			}
		
		
		
		arr[j]=arr[arr.length-1];
		
		
		for(int i=0;i<j+1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		//10,20,30,40
		
		
		*/
		
		
		
		//by hashset: (sorted array):
		/*
		
		int[] arr= {10, 10,20, 30,40, 40, 50};
	
				
		HashSet<Integer> set1=new HashSet<>();		
		for(int i=0;i<arr.length;i++)
		{
			set1.add(arr[i]);
		}
		
		for(int a:set1)
		{
			System.out.println(a+" ");
		}
		
		//50, 20, 40, 10, 30
		*/
		
		
		
		
		/*
		//by hashset: (unsorted array):
		int[] arr= {10, 10,20, 30,20,40, 40, 50, 10};
		
		
		HashSet<Integer> set1=new HashSet<>();		
		for(int i=0;i<arr.length;i++)
		{
			set1.add(arr[i]);
		}
		
		for(int a:set1)
		{
			System.out.println(a);
		}
		
		//50, 20, 40, 10, 30
		*/
		
		
		
		
		//************************************************
		//need to chk again - 50, 20, 40, 10, 30 should be like 10, 20, 30, 40, 50
		//*****************************************************
	
			}

}
