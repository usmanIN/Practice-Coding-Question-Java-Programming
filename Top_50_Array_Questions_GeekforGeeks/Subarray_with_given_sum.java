package Top_50_Array_Questions_GeekforGeeks;

public class Subarray_with_given_sum {

	static void subarray_Sum(int length, int[] arr, int sum) {
		int temp = 0, i, j;
		for(i=0; i< length; i++) {
			for(j=i+1; j < length; j++) {
				temp = arr[i]+ arr[j];
				if(temp > sum && temp == sum) {					
					break;
				}
			}
			if(temp == sum) {
				System.out.println(i+" "+j+" "+temp);
				break;
			}
			temp = 0;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};//{1,2,3,7,5}; 
		int sum =  15; //12;
		
		subarray_Sum(arr.length, arr, sum); //Brute Force Solution

	}

}



//Given an unsorted array A of size N that contains only non-negative integers, 
// find a continuous sub-array which adds to a given number S.
//In case of multiple subarrays, return the subarray which comes first on moving from left to right.