package Patterns;

public class reverseAlphbateRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i=0; i<N; i++)
		{
			char ch = (char)(int)('A'+N-i-1);
			for(int j=0; j<=i; j++) 
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
			
		}
		
	}

}
