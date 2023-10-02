package Patterns;

public class hollowCircle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =10;
		for(int i= 0 ; i<=2*N; i++)
		{
			for(int j =0 ; j<=2*N; j++)
			{
				double dist = Math.sqrt((i-N)*(i-N) + (j-N)*(j-N));
				if(dist > N - 0.5 && dist < N+0.5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
