package ArrayQuestion;

public class rotateKElement {

	// 1. Approch
	public static void rotateArr(int[] arr, int k) {
	//Brute Force Approches	
		while(k>0) {
			int temp = arr[0];
			for(int i=0; i<arr.length-1; i++)
			{
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp;
			k--;
		}
	}
	
	// 2. Approch
	public static void Reverse(int[] arr, int start, int end)
	{
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end --;
		}
	}
	
	public static void RotateRight(int[] arr, int n, int k)
	{
		Reverse(arr,0,n-k-1); // Reverse first n-k element
		Reverse(arr,n-k, n-1); // Reverse last k element
		Reverse(arr,0,n-1); // Reverse whole element
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
	//	rotateArr(arr,3);
		RotateRight(arr,arr.length, 3);
		print(arr);

	}

}
