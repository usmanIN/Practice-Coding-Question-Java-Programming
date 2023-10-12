package Random_question_solution_JAVA;

public class checkArraySorted {
	public static boolean sorted(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]>arr[i+1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2,3,3, 4, 5};
		System.out.println(sorted(arr));
	}

}
