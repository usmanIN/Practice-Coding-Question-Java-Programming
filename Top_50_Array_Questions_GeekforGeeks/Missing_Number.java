package Top_50_Array_Questions_GeekforGeeks;

//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
//Find the missing element.
//Example:
//Input: 	N = 5	A[] = {1,2,3,5}		Output: 4
//Input:	N = 10	A[] = {6,1,2,8,3,4,7,10,5}		Output: 9
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)

public class Missing_Number {
	
	static void solution_one(int N, int[] arr) {
		int temp = (N*(N+1))/2;
		for(int i=0; i<arr.length; i++) {
			temp =  temp - arr[i];
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,1,2,8,3,4,7,10,5};
		int N = 10;
		
		solution_one(N, arr); // O(N)
	}

}
