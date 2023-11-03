package Prepbytes_Solution_JAVA;

import java.util.*;
import java.io.*;

public class Dice_Game {
	 
	  public static void main(String args[]) throws IOException {
	    
	    //write your code here
	    
	    
	    int pragya=0, tina=0;
	    Scanner scan = new Scanner(System.in);
	    int test_case = scan.nextInt();
	    while(test_case>0){
	      int x = scan.nextInt();
	      int y = scan.nextInt();
	        if(x>y){
	          pragya++;
	        }else if(y>x){
	          tina++;
	        }
	      test_case--;
	    }
	    scan.close();
	    
	    if(pragya>tina){
	      System.out.println("Pragya");
	    }else if(tina>pragya){
	      System.out.println("Tina");
	    }else{
	      System.out.println("Draw");
	    }
	    
	    
	  }
}
