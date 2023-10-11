package BasicMaths;

public class greatCommonFactor {
	static int counter = 0;
	
	public static void gcd(int M, int N)
	{
		//brute force solution
		int minimum = Math.min(M, N);
		int hcf = 1;
		for(int i=1; i<minimum; i++)
		{
			if(M%i==0 && N%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("GCD: "+hcf);
		
	}
	
	public static int gcdOptimalRecursion(int M, int N)
	{	counter++;
		//base case
		if(M==0) return N;
		
		return gcdOptimalRecursion(Math.max(M, N)-Math.min(M, N), Math.min(M, N));
	}
	public static int gcdOptimalModRecursive(int M, int N)
	{	counter++;
		//base case
		if(M==0) return N;
		return gcdOptimalModRecursive(Math.max(M, N)%Math.min(M, N), Math.min(M, N));
	}
	
	public static void gcdOptimal(int M, int N)
	{
		while(M > 0 && N > 0)
		{
			if( M > N)  M = M % N;
			else N = N % M;			
		}
		if(M==0)
		{
			System.out.println("1"+ N);
		}
		else
		{
			System.out.println("2"+M);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 18;
		int second = 81;		
//		gcd(first,second);
		gcdOptimal(first,second);//gcdOptimalRecursion(first,second);   //gcdOptimalModRecursive(first, second);
//		System.out.println(nums);
//		System.out.println(counter);
	}

}
