package Prepbytes_Solution_JAVA;
import java.util.*;
import java.io.*;

public class Journey_of_Bablu_and_Dablu {
	 public static void main(String args[]) throws IOException {
		    
		    //write your code here
		    Scanner scan =  new Scanner(System.in);
		    int test_case =  scan.nextInt();
		    
		    while(test_case>0){
		      
		     int n =  scan.nextInt();
		     int i = n%8;
		     
		     if(i==0){
		       System.out.println((n-1)+"SL");
		     }else if(i==1){
		       System.out.println((n+3)+"LB");
		     }else if(i==2){
		       System.out.println((n+3)+"MB");
		     }else if(i==3){
		       System.out.println((n+3)+"UB");
		     }else if(i==4){
		       System.out.println((n-3)+"LB");
		     }else if(i==5){
		       System.out.println((n-3)+"MB");
		     }else if(i==6){
		       System.out.println((n-3)+"UB");
		     }else if(i==7){
		       System.out.println((n+1)+"SU");
		     }
		     
		     test_case--;
		    }
		  }
}
