package Prepbytes_Solution_JAVA;

import java.util.*;
import java.io.*;

public class Leap_Year_Or_Not {

  static boolean checkYear(int n){
      if(n%4==0){
        if(n%100==0){
          if(n%400==0){
            return true;
          }else{
            return false;
          }
        }
        else{
          return true;
        }
        
        
      }else{
        return false;
      }
  }
  public static void main(String args[]) throws IOException {
    
    Scanner scan =  new Scanner(System.in);
    int test_case = scan.nextInt();
    while(test_case>0){
      int n = scan.nextInt();
      if(checkYear(n)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
      
      test_case--;
    }
    scan.close();
  }
}