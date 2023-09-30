package Top_50_Array_Questions_GeekforGeeks;

import java.util.Arrays;

public class chocolateProblem {
	
	public static int chocoProblem(int arr[], int m){
		Arrays.sort(arr); 
		int diff_min = Integer.MAX_VALUE;
		for(int i=0; i+m-1 < arr.length; i++) {
			if(arr[i+m-1]-arr[i] < diff_min) {
				diff_min = arr[i+m-1]- arr[i];
			}
		}
		return diff_min; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int m =  5;
		int diff_min = chocoProblem(arr, m);
		System.out.println(diff_min);
	}

}
