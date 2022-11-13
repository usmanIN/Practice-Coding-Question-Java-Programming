package Learning_basic_Algorithm_Java;

import java.util.Arrays;

public class Merge_Sort {
	
	


	public static void merge(int[] arr, int start, int mid, int end) {
	
		int sub_size_1 = mid - start + 1;
		int sub_size_2 = end - mid;
		
		int sub_array_1[] = new int [sub_size_1];
		int sub_array_2[] = new int [sub_size_2];
		
		for(int i=0; i<sub_size_1;i++) {
			sub_array_1[i] = arr[start + i];
		}
		for(int j=0; j<sub_size_2; j++) {
			sub_array_2[j] =  arr[mid+1+j];
		}
		
		
		int i=0, j=0, k=start;
		
		while(i<sub_size_1 && j <sub_size_2) {
			if(sub_array_1[i]<=sub_array_2[j]) {
				arr[k] = sub_array_1[i];
				i++;
			}else {
				arr[k] = sub_array_2[j];
				j++;
			}
			k++;
		}
		
		while(i<sub_size_1) {
			arr[k] = sub_array_1[i];
			k++;
			i++;
		}
		
		while(j<sub_size_2) {
			arr[k] = sub_array_2[j];
			k++;
			j++;
		}
		
	}
	
	
	public static void merge_sort(int arr[], int start, int end) {
		
		if(start < end) {
			
			int mid = (start+end)/2;
			merge_sort(arr,start, mid);
			merge_sort(arr,mid+1,end);
			
			merge(arr,start,mid,end);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { -2, 45, 0, 11, -9 };
	    
		
		System.out.println(Arrays.toString(data));
		
		merge_sort(data, 0 , data.length-1);
		
		System.out.println(Arrays.toString(data));
	}

}
