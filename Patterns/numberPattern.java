package Patterns;

public class numberPattern {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int N = 3;
		for(int i=0; i<2*N-1; i++)
		{
			for(int j=0; j<2*N-1;j++)
			{
				int top = i;
				int bottom = j;
				int right = (2*N - 2) - j;
				int left = (2*N - 2) - i;
				int result = (N- Math.min(Math.min(top, bottom), Math.min(left, right)));
				System.out.print(result+" ");
				
			}
			System.out.println("");
		}
	}

}
