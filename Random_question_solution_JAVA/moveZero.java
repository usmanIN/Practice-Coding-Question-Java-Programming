package Random_question_solution_JAVA;

public class moveZero {

	public static void move_All_zeros(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{ 
			int j=i;
			while(arr[j]==0 && j<arr.length-1) 
			{
				j++;
			}
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
	}
	public static void move_All_zeroSecond(int[] arr)
	{
		int j = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0) {
				j = i;
				break;
			}
		}
		
		if(j == -1) return;
		for(int i= j+1; i<arr.length; i++)
		{
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}		
	}
	public static void move_All_zeroThird(int[] arr)
	{
		int j = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0) {
				arr[j] = arr[i];
				j++;
			}
		}
		
		while(j<arr.length)
		{
			arr[j] = 0;
			j++;
		}
	}
	
	public static void print(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		 //move_All_zeros(arr);
//		 move_All_zeroSecond(arr);
		 move_All_zeroThird(arr);
		 
		 print(arr);
	}

}
