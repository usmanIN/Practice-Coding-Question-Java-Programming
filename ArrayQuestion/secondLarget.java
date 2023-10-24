package ArrayQuestion;

public class secondLarget {
	
	public static int secondLarge(int[] arr) {
		int first = arr[0];
		int second = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}else if(arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		
		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,3,0};
		
		int result = secondLarge(arr);
		
		System.out.print(result);
		
		
	}

}
