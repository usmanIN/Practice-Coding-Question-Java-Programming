package Learning_basic_Algorithm_Java;

import java.util.Arrays;
public class Bubble_Sort {

	static void bubble_sort(int[] arr) {
	
		int temp, length =arr.length;
		
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = { -2, 45, 0, 11, -9 };
	    
		
		System.out.println(Arrays.toString(data));
		
		bubble_sort(data);
		
		System.out.println(Arrays.toString(data));
	}

}
