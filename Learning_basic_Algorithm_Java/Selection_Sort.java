package Learning_basic_Algorithm_Java;

import java.util.Arrays;

public class Selection_Sort {

	static void selection_sort(int[] arr) {
		
	
		for(int i=0; i < arr.length-1; i++) {
			int min_index = i;
			
			for(int j=i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;	
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = { -2, 45, 0, 11, -9 };
	    
		
		System.out.println(Arrays.toString(data));
		
		selection_sort(data);
		
		System.out.println(Arrays.toString(data));
	}

}
