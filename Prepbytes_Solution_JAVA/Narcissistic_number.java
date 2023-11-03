package Prepbytes_Solution_JAVA;

import java.util.*;
import java.io.*;

public class Narcissistic_number {
  static int  digitCount(int num){
    int count = 0;
    while(num>0){
      num/=10;
      count++;
    }
    return count;
  }
  static int checkNumber(int num){
    
    int sum=0, count = digitCount(num);
    while(num>0){
      sum += Math.pow((num%10),count);
      num/=10;
    }
    return sum;
  }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scan = new Scanner(System.in);
    int test_case = scan.nextInt();
    while(test_case>0){
      int num = scan.nextInt();
      int temp = checkNumber(num);
      System.out.println((temp==num)?"Yes":"No");
      test_case--;
    }
    scan.close();
    
  }
}