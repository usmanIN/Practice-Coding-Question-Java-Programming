package BasicMaths;

public class powerOfValue {
	
	public static int power(int x, int n) {
		
		int mul = 1;
		for(int i=1; i<=n;i++) {
			mul = mul*x;
		}
		return mul;
	}
	
	public static double f(double x, int n)
	{
		if(n==0) return 1;
		double ans = f(x,n/2);
		if((n&1)!= 0)
			return x*ans*ans;
		else
			return ans*ans;			
	}
	public static double pow(double x, int n) {
		if(n < 0)
			return powerBinary(1/x, n);
		return powerBinary(x,n);
	}
	public static double powerBinary(double x, int n)
	{
		double ans = 1;
		
		while(n!=0)
		{
			if((n&1)!=0) {
				ans = ans * x;
			}
			x = x * x;
			n = n/2; // n>>1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		double result = pow(5,2);
		System.out.print(result);	
	}

}
