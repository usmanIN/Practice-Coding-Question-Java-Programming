package Prepbytes_Solution_JAVA;

import java.util.*;
import java.io.*;


public class Even_fibonacci {

	static int fabo(int n){
        int a = 0, b = 1, c;
        if(n==0){
          return 0;
        }
        if(n==1 || n==2){
          return 1;
        }
        for(int i=2; i<=n; i++){
          c = a + b;
          a = b ;
          b = c;
        }
        return b;
  }
  
  static int dynamicFabo(int n){
      int arr[] = new int[n+2];
      arr[0] = 0;
      arr[1] = 1;
      for(int i=2; i<=n; i++){
          arr[i] = arr[i-1] + arr[i-2];
      }
      return arr[n];
  }
  
  
  
  static void fabonacci_test() {
	  int trial = 4, attempt = 0 ,i = 0, result = 0;
      boolean status = true;
      while(status){
          result = dynamicFabo(i);
          if(result%2==0 && trial == attempt){
              status = false;
          }
          if(result%2==0){
              attempt++;
          }
          i++;
      }        
      System.out.println(result);
  }
  

  static long nthEvenFibonacci(long n){
     // code here
     long N=3*n;
     long a=1,b=0,c=0;
     for(long i=1;i<=N;i++)
       {
           c=(a+b)%1000000007;
           a=b;
           b=c;
       }
       
       return b%1000000007 ;
  }
  
  
  public static void main(String args[]) {
    
 Scanner scan = new Scanner(System.in);
      
      int test_case = scan.nextInt();
      
      while(test_case > 0){
      
        long num = scan.nextLong();
        System.out.println(nthEvenFibonacci(num));
        
        test_case--;
      }
        
    }
  
}

