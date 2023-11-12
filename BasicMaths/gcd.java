package BasicMaths;

public class gcd {
	
	public static int sol(int a, int b)
	{
		int min = Math.min(a, b);
		while(min > 0)
		{
			if(a%min == 0 && b%min == 0) break;
			min--;
		}
		return min;
	}
	public static int eculidSol(int a, int b)
	{
		while(a!=b)
		{
			if(a>b)
				a = a-b;
			else
				b = b-a;
		}
		return a;
	}
	public static int thirdSol(int a, int b)
	{
		if(b==0)return a;
		return thirdSol(b, a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ans = thirdSol(12, 15);
		System.out.println(ans);
	}

}
