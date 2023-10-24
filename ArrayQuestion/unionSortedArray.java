package ArrayQuestion;

import java.util.*;

public class unionSortedArray {
	
	public static Object[] unionSortedArr(int[] arr, int[] brr)
	{
		
		Set<Integer> result = new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			result.add(arr[i]);
		}
		
		for(int i=0; i<brr.length; i++)
		{
			result.add(brr[i]);
		}
		
		return result.toArray();
	}
	
	public static ArrayList<Integer> unionOptimal(int[] arr, int[] brr)
	{
		int i=0, j=0;
		ArrayList<Integer> result = new ArrayList<>();
		
		while(i<arr.length && j<brr.length)
		{
			if(arr[i]<=brr[j]) {
				if(result.size() == 0 || result.get(result.size()-1)!=arr[i]) 
				{
					result.add(arr[i]);
				}
				i++;
			}else {
				if(result.size() == 0 || result.get(result.size()-1)!=brr[j]) 
				{
					result.add(brr[j]);
				}
				j++;
			}
		}
		
		//IF any element left in first array
		while(i<arr.length) {
			if(result.get(result.size()-1)!=arr[i]) {
				result.add(arr[i]);
			}
			i++;
		}
		//If any element left in second array
		while(j<brr.length) {
			if(result.get(result.size()-1)!=brr[j]) {
				result.add(brr[j]);
			}
			j++;
		}		
		return result;
	}
	
	
	public static void print(Object[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] brr = {2, 3, 4, 4, 5, 11, 12};
		
		
//		Object[] drr = unionSortedArr(brr,arr);
//		
//		print(drr);
		
		ArrayList<Integer> itemList = unionOptimal(arr,brr);
		for(int i=0; i<itemList.size(); i++)
		{
			System.out.print(itemList.get(i)+" ");
		}
		System.out.println("");
		
	}	

}
