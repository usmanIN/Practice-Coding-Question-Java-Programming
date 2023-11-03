package Prepbytes_Solution_JAVA;
import java.util.*;
import java.io.*;
public class Sum_of_digits {
	  public static void main(String args[]) throws IOException {
		    
		    Scanner scan =  new Scanner(System.in);
		    
		     int num =  scan.nextInt();
		      int sum = 0;
		      while(num>0){
		        sum+= num%10;
		        num = num/10;
		      }
		      scan.close();
		          
		      System.out.println(sum);
		  }
}
