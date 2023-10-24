package ArrayQuestion;

public class removeDuplicateSortedArray {

	public static int twoPointer(int[] arr) {
		int k = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[k]!=arr[i]) {
				k++;
				arr[k] = arr[i];
			}
		}
		return k+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {1,1,2,2,2,3,3};
	
	int idx = twoPointer(arr);
	
	for(int i=0; i<idx; i++)
	{
		System.out.println(arr[i]);
	}
	
	}

}
