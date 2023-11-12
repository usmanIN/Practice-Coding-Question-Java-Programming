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
	public static double fourthSol(double x, int n)
	{
		if(n<0)  return 0;
		if(n==0) return 1;
		if(n%2==0) return fourthSol(x,n/2)*fourthSol(x,n/2);
		return fourthSol(x,n-1)*x;
	}
	public static double fifthSol(double x, int n)
	{
		double ans = 1;
		while(n>0)
		{
			if(n%2!=0) ans = ans*x;
			x = x * x;
			n= n/2;
		}		
		return ans;
	}
	public static double toHandleLargeNumber(double x, int n, int m)
	{
		double ans = 1;
		while(n>0)
		{
			if((n&1)!= 0) ans = (ans*x)%m;
			x = (x * x)%m;
			n = n >> 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		double result = fifthSol(5,64);
		System.out.println(result);
		result = toHandleLargeNumber(5,654,10);
		System.out.println(result);
	}

}
