package Patterns;

public class halfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i+1; j<n; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++) {
				System.out.print("*");
			}
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println("");
		}
	}

}
