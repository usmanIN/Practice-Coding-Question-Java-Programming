package Top_50_Array_Questions_GeekforGeeks;

//Problem: Given an array A of size N of integers. 
// Your task is to find the minimum and maximum elements in the array. 
import java.util.Arrays;

public class Minimum_and_Maximum_element {
	
	static void minMax(int size, int[] array) {
		int lowest = array[0];
		int highest = array[0];
		
		for(int i=1; i<size; i++) {
			if(array[i] > highest) {
				highest = array[i];
			}
			if(array[i] < lowest) {
				lowest = array[i];
			}			
		}
		
		System.out.println(lowest+ "  "+ highest);
		
	}

	public static void main(String[] args) {
	
		int[] arr = {345, 234, 21,56,  167};
		
		minMax(arr.length, arr);
		
	}

}
