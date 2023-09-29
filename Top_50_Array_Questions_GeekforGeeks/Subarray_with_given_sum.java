package Top_50_Array_Questions_GeekforGeeks;

import java.util.Arrays;

//Given an unsorted array A of size N that contains only non-negative integers, 
//find a continuous sub-array which adds to a given number S.
//In case of multiple subarrays, return the subarray which comes first on moving from left to right.
// 1) arr[] = {1,2,3,4,5,6,7,8,9,10}; sum = 15;
// 2) arr[] = {1,2,3,7,5}; sum =12;

public class Subarray_with_given_sum {

	static void subarray_Sum(int length, int[] arr, int sum) {
		int temp =0, j ,i;
		for(i=0; i<length; i++) {
			temp = 0;
			for(j=i; j<length; j++) {
				temp = temp+arr[j];
				if(temp >=sum) {
					break;
				}
			}
			if(temp == sum) {
				System.out.println(i+" "+j);
				break;
			}
		}		
	}
	
	static void optimal_solution(int length, int[] arr,int sum) {
		int temp=arr[0],j=0;
		for(int i=1; i<=length; i++) {
					
			while(temp > sum && j < i-1) {
				temp = temp - arr[j];
				j++;
			}
			
			if(temp==sum) {
				System.out.println(j+" "+i);
				break;
			}		
			
			if(i < length) {
				temp =  temp + arr[i];
			}			
		}
	}
	
	static int[] second_sum(int length, int[] arr, int sum) {
		int i=0, j=0;
		while(sum!=0) {
			sum = sum - arr[i];
			if(sum < 0) {			
				sum = sum + arr[j];
				j++;
			}					
			if(i<length) {
				i++;
			}
		}
		if(sum==0) {
			return new int[] {i,j};
		}else {
			return new int[] {-1};	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,7,5}; 
		int sum = 21;
		
		
	//	subarray_Sum(arr.length, arr, sum); // O(N^2)		
	//		optimal_solution(arr.length, arr, sum); // O(N)
		int[] crr = second_sum(arr.length, arr, sum); // O(N^2)
		System.out.println(Arrays.toString(crr));

	}

}


