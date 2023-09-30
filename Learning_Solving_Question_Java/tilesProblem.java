package Learning_Solving_Question_Java;


public class tilesProblem {

	public static int tileCount(int n,int m){
	
		if(n == m ) {
			return 2;
		}
		if(n < m) {
			return 1;
		}
		
		// waysVertical + waysHorizontal
		return tileCount(n-m,m) + tileCount(n-1,m);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4, m=2;
		int totalWays = tileCount(n,m);
		System.out.println(totalWays);
	}

}
