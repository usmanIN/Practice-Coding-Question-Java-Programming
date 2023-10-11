package BasicMaths;

public class basicCountDigit {

	public static void countDigit(int N)
	{
//		int counter = 0;
//		while(N>0)
//		{
//			counter++;
//			N = N/10;
//		}
//		System.out.println("Total: "+counter);
//		String str = Integer.toString(N);
//		System.out.println(str.length());
		
		int digits = (int) Math.floor(Math.log10(N)+1);
		System.out.print(digits);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 838722;
		countDigit(num);
	}

}
