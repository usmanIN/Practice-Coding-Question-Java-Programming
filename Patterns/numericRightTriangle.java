package Patterns;

public class numericRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		int count = 1;
		for(int i=0; i< size; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println("");
		}

	}

}
