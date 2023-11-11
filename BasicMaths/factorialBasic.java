package BasicMaths;

public class factorialBasic {
	public static int facto(int n)
	{
		if(n==0) return 1;
		return n*facto(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = 1;
//		while(n>0)
//		{
//			ans = ans*n;
//			n--;
//		}
		
		ans = facto(n);
		System.out.println(ans);
	}

}
