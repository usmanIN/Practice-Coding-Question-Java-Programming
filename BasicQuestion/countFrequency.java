package BasicQuestion;

public class countFrequency {
	
	public static void basicAlgo(int[] arr)
	{
		//1. find larget element in array
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i]) max = arr[i];
			
		}
		int[] temp =  new int [max+1];
		// insert the postions
		for(int i=0; i< arr.length; i++)
		{			
			temp[arr[i]] += 1;
		}
		
		//fetch and print value		
		for(int i=0; i<temp.length; i++)
		{
			if(temp[i] >0) {
				System.out.println(i + " -> " + temp[i]);
			}
		}	
	}
	
	public static void approchOne(int[] arr)
	{
		boolean[] visited = new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			if(visited[i]== true) continue;
			int count = 1;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" => "+count);		
		}	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,10,15,10,5};
		basicAlgo(arr);
//		approchOne(arr);
	}

}
