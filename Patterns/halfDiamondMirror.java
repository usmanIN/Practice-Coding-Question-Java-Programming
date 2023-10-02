package Patterns;

public class halfDiamondMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i = 0; i<N; i++)
		{
			for(int j = 0; j <=i; j++)
			{
				System.out.print("*");
			}
			
			for(int j = 1; j <(2*N)- (2*i+1); j++)
			{
				System.out.print(" ");
			}
			
			for(int j = i; j >= 0; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 1; i<N; i++)
		{
			for(int j = 0; j <N-i; j++)
			{
				System.out.print("*");
			}
			
			for(int j = 1; j <(2*i+1); j++)
			{
				System.out.print(" ");
			}
			
			for(int j = N-i; j >0; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}	
	}

}
