package Patterns;

public class reverseTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=length; i>0; i--)
		{
			for(int j=0; j<length-i+1; j++)
			{
				System.out.print(" ");				
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<length-i+1; j++)
			{
				System.out.print(" ");				
			}
			
			System.out.println("");
		}
	}

}
