package BasicMaths;

public class LCM {

	public static int firstSol(int a, int b)
	{
		int ans = Math.max(a, b);
		while(true) {
			if(ans%a==0 && ans%b==0) break;
			ans++;
		}
		return ans;
	}
	public static int secondSol(int a, int b)
	{
		int great = Math.max(a, b);
		int small = Math.min(a, b);
		for(int i=great; ; i+=great) {
			if(i%small == 0) return i;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = secondSol(12,15);//firstSol(12,15);
		System.out.println(ans);
	}

}
