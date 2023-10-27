package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class nextPermutation {
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void getPermutation(int[] arr,int currentIndex, ArrayList<ArrayList<Integer>> ans) {
		
		if(currentIndex == arr.length) {
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<arr.length; i++)
			{
				list.add(arr[i]);
			}
			ans.add(list);
			return;
		}
		
		for(int i=currentIndex; i<arr.length; i++)
		{
			swap(arr,i,currentIndex);
			getPermutation(arr,currentIndex+1,ans);
			swap(arr,i,currentIndex);
		}
	}
	
	public static void reverse(int[] arr, int start, int end)
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void nextPermutationOptimal(int[] arr)
	{
		// 1. find the break point arr[i]<arr[i+1]
		// 2. find the element with minimum difference and element > break point
		// 	   a- swap the element
		// 3. sorted the right elements from break point swap
		int n = arr.length;
		int break_point = -1;
		
		for(int i=n-2; i>=0; i--)
		{
			if(arr[i]<arr[i+1]) {
				break_point = i;
				break;
			}
		}
		
		if(break_point != -1)
		{
			for(int i=n-1; i>=break_point; i--)
			{
				if(arr[i]>arr[break_point]) {
					swap(arr, i, break_point);
					break;
				}
			}
		}
		reverse(arr,break_point+1,n-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<ArrayList<Integer>> list = new ArrayList<>();		
		int[] arr = {2,1,5,4,3,0,0};		
		nextPermutationOptimal(arr);		
		//getPermutation(arr,0,list);		
//		for(int i=0; i<list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
	}

}
