package Random_question_solution_JAVA;

public class maxMinNum {
	
	public static void minMax(int arr[]) {
		
		int min, max;
		min = max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}else if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Min: "+min+" Max: "+max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {3, 5, 4, 1, 9};
		
		minMax(arr);

	}

}
