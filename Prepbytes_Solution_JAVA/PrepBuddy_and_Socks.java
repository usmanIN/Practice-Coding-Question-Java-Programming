package Prepbytes_Solution_JAVA;
import java.util.*;
import java.io.*;
public class PrepBuddy_and_Socks {
	public static void main(String args[]) throws IOException {
	    
	    //write your code here
	    Scanner scan = new Scanner(System.in);
	    int test_case = scan.nextInt();
	    
	    while(test_case>0){
	      int pair_socks = scan.nextInt();
	      if(pair_socks == 1){
	        System.out.println(pair_socks+1);
	      }else{
	        System.out.println(pair_socks+1);
	      }
	      
	      test_case--;
	    }
	    scan.close();
	    
	  }
}
