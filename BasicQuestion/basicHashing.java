package BasicQuestion;

public class basicHashing {

	public static int getCounter(int[] arr, int item)
	{
		int count = 0;
		for(int i = 0 ; i<arr.length; i++)
		{
			if(arr[i] == item)
			{
				count = count + 1;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,2,1,3,5};
		int[] query = {1,3,4,2,8};
		
		//counting no. of element in array;
		
		for(int i=0; i<query.length; i++)
		{
			System.out.println(query[i] + " -> "+ getCounter(arr,query[i]));
		}
	}

}
