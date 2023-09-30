package Top_50_Array_Questions_GeekforGeeks;

public class sumOfSubset {
	
	public static void sumSubset(int arr[], int left, int right, int sum) {
		
		//BASE CASE
		if(left > right) {
			System.out.print(sum+" ");
			return;
		}
		
		sumSubset(arr, left+1, right, sum + arr[left]);
		
		sumSubset(arr, left+1, right, sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3};
		
		sumSubset(arr, 0, arr.length-1, 0);
	}

}
