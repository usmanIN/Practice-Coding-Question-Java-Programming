package Prepbytes_Solution_JAVA;
import java.util.*;


public class first_digit_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test_case = scan.nextInt();
		while(test_case>0) {
			int num = scan.nextInt();
			while(num>=10) {
				num = num/10;
			}
			
			System.out.println(num);
			test_case--;
		}
		scan.close();
		

	}

}