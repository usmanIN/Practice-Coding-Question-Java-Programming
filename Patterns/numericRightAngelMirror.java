package Patterns;

public class numericRightAngelMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int spaces = 2*(n-1);
		for(int i = 1; i <= n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);				
			}
			
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);				
			}
			
			
			spaces = spaces - 2;
//			for(int j = 0; j < i ; j++) 
//			{
//				System.out.print(j+1);
//			}
//			for(int j = 0; j< (2*n)-(2*i-1); j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j = 0; j < i ; j++) 
//			{
//				System.out.print(j+1);
//			}
			System.out.println("");
		}
		
	}

}
