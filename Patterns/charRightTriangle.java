package Patterns;

public class charRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i = 0; i < N; i++)
		{
			for(char ch='A'; ch<= 'A'+i; ch++)
			{
				System.out.print(ch +" ");
			}
			System.out.println("");
		}
	}

}
