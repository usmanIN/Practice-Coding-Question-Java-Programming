package Solution_random_prepbytes_question;

public class reverseArray {
	
	public static void revArr(int arr[]) {
		int len = arr.length;
		for(int i=0; i<len/2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - i - 1];
			arr[len - i -1] = temp;
		}
	}
	
	public static void reverseArr(int arr[], int start, int end) {
		
		while(start < end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void recursiveArr(int arr[], int start, int end) {
		
		if(start >= end) return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		recursiveArr(arr, start+1,end-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,1,2,3,4,5};
//		revArr(arr);
//		reverseArr(arr,0, arr.length-1);
		recursiveArr(arr,0, arr.length-1);
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
	}

}
