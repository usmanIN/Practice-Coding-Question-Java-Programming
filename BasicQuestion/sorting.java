package BasicQuestion;

public class sorting {
	
	public static void selectionSort(int[] arr)
	{
		//write your code here		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	public static void printArray(int[] arr)
	{
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,4,7,5};
		
		selectionSort(arr);
		printArray(arr);
		
	}

}
