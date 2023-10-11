package BasicMaths;

public class printDivisors {

	public static void divisorsOptimal(int M)
	{
		for(int i=1; i<= (int)Math.sqrt(M); i++)
		{
			if(M%i==0)
			{
				System.out.print(i+" ");
				if(i != M/i) System.out.print(M/i+" ");
			}
		}
	}
	
	public static void divisors(int M)
	{
		for(int i=1; i<= M; i++)
		{
			if(M%i==0)
			{
				System.out.print(i+" ");
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 36;
		//divisors(nums);
		divisorsOptimal(nums);
	}

}
