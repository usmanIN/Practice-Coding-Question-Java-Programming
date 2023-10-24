package ArrayQuestion;

public class checkLeader {

	public static void leader(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean isLeader = true;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j]) 
				{
					isLeader = false;
				}
			}
			if(isLeader) {
				System.out.print(arr[i]+" ");
			}	
		}
	}
	
	public static void leaderOptimal(int[] arr)
	{
		int lead = arr[arr.length-1];
		System.out.print(lead+" ");
		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i] > lead) {	
				System.out.print(arr[i]+" ");
				lead = arr[i];
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {10, 22, 12, 3, 0, 6};		
//		leader(arr);
		leaderOptimal(arr);
		
	}

}
