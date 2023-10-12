package Random_question_solution_JAVA;

public class largestElement {
	
	public static int largeNumber(int[] arr)
	{
		if(arr.length == 0 ) return -1;
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int largeRec(int[] arr, int max, int N) {
		
		if(N == arr.length) {
			return max;
		}
		if(max < arr[N]) {
			max = arr[N];
		}
		
		return largeRec(arr,max, N+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {2,5,1,3,0};
//		int result = largeNumber(arr);
		int result = largeRec(arr,arr[0], 0);
		
		System.out.print(result);		
	}

}
