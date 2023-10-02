package Patterns;

public class charTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i = 0; i < N; i++)
		{
			char ch = (char)(int)('A' + i);
			for(int j = 0 ; j <=i; j++)
			{
				System.out.print(ch +" ");
			}
			System.out.println("");
		}
	}

}
