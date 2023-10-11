package BasicMaths;

import java.util.Arrays;

public class reverseArrayRecursion {
	
	public static void reverseArr(int arr[],int i, int j)
	{
		//base case 
		if(i>j) return;
		
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
		
		reverseArr(arr,i+1,j-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		
		System.out.println("Before: "+ Arrays.toString(arr));
		reverseArr(arr,0, arr.length-1);		
		System.out.println("After: "+ Arrays.toString(arr));

	}

}
