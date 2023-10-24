package Random_question_solution_JAVA;

public class permutation {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void helper(int[] arr,int currentIndex) {		
		if(currentIndex == arr.length) {
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
		}		
		for(int i=currentIndex; i<arr.length; i++) {			
			swap(arr,i,currentIndex);
			helper(arr, currentIndex+1);
			swap(arr,i,currentIndex);
		}	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,1};
		
		helper(arr,0);		
	}
}