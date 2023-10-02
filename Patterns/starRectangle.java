package Patterns;

public class starRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		
		for(int i = 0;  i< N; i++) {
			
			for(int j=0; j<N; j++)
			{
				if(j==0 || j==N-1 || i == 0 || i == N-1 )
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
