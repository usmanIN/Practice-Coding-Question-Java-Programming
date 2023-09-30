package Learning_Solving_Question_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class permuteArr {
	
	public static void printPermute(ArrayList<int[]> res, int[] arr , int low, int size)
	{
		if(low == size) {			
			res.add(Arrays.copyOf(arr, arr.length));
			return;
		}else {
			
			for(int i=low; i<=size; i++) {
				swap(arr,low,i);
				printPermute(res,arr,low+1,size);
				swap(arr,low,i);
			}
			
		}
	}
	public static void swap(int[] arr, int low, int index)
	{
		int temp = arr[low];
		arr[low] = arr[index];
		arr[index] =temp;
	}
	public static ArrayList<int[]> permute(int[] nums)
	{
		ArrayList<int[]> res = new ArrayList<int[]>();
		printPermute(res,nums,0,nums.length-1);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<int[]> res = permute(arr);
		
		 // printing result
        for (int[] x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
		
	}

}
