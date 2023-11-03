package Prepbytes_Solution_JAVA;


	import java.util.*;
	import java.io.*;

	public class Modulus_Ten {
		public static void main(String args[]) throws IOException {
	    
	    //write your code here
	    Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			num = num%10;			
			System.out.println(num);
		    scan.close();
			
	  }
	}

