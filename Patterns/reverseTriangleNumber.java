package Patterns;

public class reverseTriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=length; i>0; i--) {
			for(int j=0; j<i; j++)
			{
				System.out.print((j+1)+" ");
			}
			System.out.println("");
		}
	}

}
