package Patterns;

public class hollowCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		for(int i = 0 ; i< N; i++)
		{
			for(int j= 0;  j< N-1; j++)
			{
				if(i==0 || j==0 || i==N-1 || j == N-2)
				{
					if(i==0 && j==0 || i==0 && j==N-2 || i==N-1 && j == N-2 || i==N-1 && j==0) {
						System.out.print("   ");
					}else {
						System.out.print(" * ");
					}
				}else {
					System.out.print("   ");
				}
								
			}
			System.out.println("");
		}
	}

}
