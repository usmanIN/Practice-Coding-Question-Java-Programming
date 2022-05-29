package Top_50_Array_Questions_GeekforGeeks;
import java.util.Arrays;
// Problem: Given an array, rotate the array by one position in clock-wise direction.

public class Cyclic_Rotate {
	
	static void cyclicRotate(int[] arr) {
		int length = arr.length;
		int temp = arr[length-1];
		for(int i=length-1; i > 0; i--) {
			arr[i] = arr[i-1];  
		}
		arr[0] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
		
		cyclicRotate(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
