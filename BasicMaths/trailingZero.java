package BasicMaths;

public class trailingZero {
	public static int trailZero(int n)
	{
		int count = 0;
		for(int i=5; i<n; i=i*5)
		{
			count = count + (n/i);
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =100;
		System.out.println(trailZero(N));
	}

}
