package Patterns;

public class emptyDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		
		int insideSpace = 0;
		for(int i=0; i<N; i++)
		{
			
			for(int j=0; j<=N-i-1; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<insideSpace; j++) 
			{
				System.out.print(" ");
			}
//			for(int j=0; j<2*i+1; j++) 
//			{
//				System.out.print(" ");
//			}
			for(int j=0; j<=N-i-1; j++)
			{
				System.out.print("*");
			}
			insideSpace += 2;
			System.out.println("");
			
		}
		insideSpace = 2*N-2;
		for(int i=0; i<N; i++)
		{
			
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<insideSpace; j++) 
			{
				System.out.print(" ");
			}
			insideSpace -=2;
		
//			for(int j=0; j<(2*N)-(2*i+1); j++) 
//			{
//				System.out.print(" ");
//			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
