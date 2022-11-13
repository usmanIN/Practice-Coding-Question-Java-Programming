package Learning_basic_Algorithm_Java;

import java.util.Arrays;

public class Insertion_Sort {

	public static void insertion_sort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int item = arr[i];
		 	int j = i - 1;
			
			while(j>=0 && arr[j]>item  ) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = item;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { -2, 45, 0, 11, -9 };
	    
		
		System.out.println(Arrays.toString(data));
		
		insertion_sort(data);
		
		System.out.println(Arrays.toString(data));
	}

}
