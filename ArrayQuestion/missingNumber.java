package ArrayQuestion;

import java.util.*;

public class missingNumber {
	
	public static int approchONE(int[] arr)
	{
		//1. Approch
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=i) return i;
		}
		return -1;
	}
	
	public static int approchTWO(int[] arr) {
		 
		int hash[] = new int[arr.length+1];
		for(int i=0; i<arr.length; i++)
		{
			hash[arr[i]]++;
		}
		
		for(int i=0; i<hash.length; i++)
		{
			if(hash[i]==0) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9,6,4,2,3,5,7,0,1};
		
//		int result = approchONE(arr);
		int result = approchTWO(arr);
		
		
		System.out.println(result);
		
	}

}
