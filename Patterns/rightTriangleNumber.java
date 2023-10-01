package Patterns;

public class rightTriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<=i; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println("");
		}
	}

}
