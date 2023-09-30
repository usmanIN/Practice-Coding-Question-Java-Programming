package Random_question_solution_JAVA;

public class reverseInteger {
	
	public static int getNums(int nums) {	
		int sum = 0;
		while(nums!=0) {
			sum = sum*10 + nums%10;
			nums = nums/10;
		}
		if(sum > Integer.MAX_VALUE/10 || sum < Integer.MIN_VALUE/10) {
			return 0;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = getNums(2147483647);
		System.out.println(num);
		

	}

}
