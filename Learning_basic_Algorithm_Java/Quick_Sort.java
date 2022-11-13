package Learning_basic_Algorithm_Java;

import java.util.Arrays;

public class Quick_Sort {
	
	static int partition(int[] arr, int start, int end){
	
		int pivot = arr[end];
		int k = start - 1;
		for(int i=start; i< end; i++) {
			if(arr[i]<=pivot) {
				k++;
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i]	= temp;
			}	
		}
		
		int temp = arr[k+1];
		arr[k+1] = arr[end];
		arr[end] = temp;

		return (k + 1);
	}
	static void quick_sort(int[] arr, int start, int end) {
		if(start < end) {
			
			int pivot_index = partition(arr, start, end);			
			quick_sort(arr,start, pivot_index - 1 );
			quick_sort(arr,pivot_index + 1, end);
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { -2, 45, 0, 11, -9 };
	    		
		System.out.println(Arrays.toString(data));
		
		quick_sort(data,0, data.length-1);
		
		System.out.println(Arrays.toString(data));
	}
 
}
