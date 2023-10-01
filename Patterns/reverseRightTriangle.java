package Patterns;

public class reverseRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=0; i<length; i++)
		{
			for(int j=length; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
