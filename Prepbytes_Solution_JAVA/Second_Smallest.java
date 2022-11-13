package Prepbytes_Solution_JAVA;
import java.util.*;
import java.io.*;
public class Second_Smallest {
	 public static void main(String args[]) throws IOException {
		    
		    //write your code here
		    Scanner scan = new Scanner(System.in);
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    
		    if(x>y && x<z){
		      System.out.println(x);
		    }
		    
		    if(y>x && y<z){
		        System.out.println(y);
		    }
		    
		    if(z>x && z<y){
		        System.out.println(z);
		    }
		  }
}
