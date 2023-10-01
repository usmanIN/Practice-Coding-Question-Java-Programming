package Patterns;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<length-i-1; j++)
			{
				System.out.print(" ");				
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<length-i-1; j++)
			{
				System.out.print(" ");				
			}
			
			System.out.println("");
		}

	}

}
