package Patterns;

public class hollowRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i=0; i< N; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				if(j==0 || j==i || i==N-1)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
