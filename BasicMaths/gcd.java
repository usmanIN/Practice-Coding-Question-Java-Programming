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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 84, b = 72;
		
		int ans = sol(a,b);
		System.out.println(ans);
	}

}
