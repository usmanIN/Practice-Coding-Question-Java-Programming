package BasicMaths;

//Sieve of Eratosthenes
//Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number. 
public class soe {
	
	public static void primeNumber(int n)
	{
		boolean[] prime = new boolean[n+1];
		for(int i=0; i<=n; i++)
			prime[i]= true;
		
		for(int p=2; p*p<=n; p++) {			
			if(prime[p]==true) {
				for(int i=p*p; i<=n;i= i+p)
					prime[i]=false;
			}				
		}
		for(int i=2; i<=n; i++)
		{
			if(prime[i]==true) System.out.print(i+" "); 
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
		primeNumber(n);
		primeNumber(n);
	}

}
