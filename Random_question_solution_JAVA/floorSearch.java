package Solution_random_prepbytes_question;

import java.util.*;
import java.io.*;

public class floorSearch {

  static int[] getArray(String arr){
      String[] temp = arr.trim().split(" ");
      int[] array = new int[temp.length];
      
      for(int i=0; i<temp.length; i++){
        array[i] = Integer.parseInt(temp[i]);
      }
      
      return array;
  }
  // My approch
//  static int search(int[] arr, int low, int high, int element){
//    if(low<high){
//        int mid = (low+high)/2;
//        
//        if(element == arr[mid])
//          return mid;
//        if(element<arr[mid])
//          return search(arr,0,mid-1,element);
//        
//        return search(arr,mid+1, high, element);
//    }
//    return -1;
//  }
//  
  
  // linear method 
//  static int search(int[] arr, int low, int high, int element){
//    if(element>=arr[high-1])
//      return high-1;
//    if(element<arr[low])
//      return -1;
//      
//    for(int i=1; i<high; i++){
//      if(arr[i]>element){
//        return (i-1);
//      }
//    }        
//    return -1;
//  }
  // binary method 
  static int search(int[] arr, int low, int high, int element) {
	  if(low>high)
		  return -1;
	  
	  if(element >= arr[high]) 
		  return high;
	  
  		int mid = (low+high)/2;
  		
  		
  		if(arr[mid]==element) 
  			return mid;
  	// If x lies between mid-1 and mid
  		if(mid>0 && arr[mid-1]<=element && element < arr[mid])
  			return mid-1;
  		
  		
  		if(element < arr[mid])
  			return search(arr, low, mid-1, element);
  		
  		return search(arr,mid+1, high, element);  		
  }
  
  
  
  
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner scan = new Scanner(System.in);
    int test_case = Integer.parseInt(scan.nextLine());
    
    while(test_case >0){
      String first_line = scan.nextLine();
      String second_line = scan.nextLine();
      int[] first = getArray(first_line);
      int[] second = getArray(second_line);
      
      int result = search(second, 0, first[0]-1, first[1]); //I added high-1 here because array error out of bound issue
      
      if(result > 0){
        System.out.println(result);
      }else{
        System.out.println(-1);
      }
      
      
      test_case--;
    }
    
    
  }
}










//
//
//Floor of a number
//We all have learnt about floor of a number in school. Let us try and frame a problem statement around that. So, you are given a number 
//x
// and a sorted array 
//A
// containing 
//N
// distinct integers. Your task is to find floor of 
//x
// in the array 
//A
//(
//0
//-based indexing). Now you might be wondering what will be floor of 
//x
// in 
//A
//? Let me tell you, the floor of 
//x
// will largest element in 
//A
// that is smaller than or equal to 
//x
//.
//
//Input format
//First line contains an integer 
//T
//, number of test cases. Then follows 
//T
// test cases. Each test case consists of two lines.
//First line contains 
//N
// and 
//x
//.
//Second lines contains 
//N
// space separated integers.
//
//Output format
//Print 
//T
// lines, each containing index of the floor of 
//x
// if it exists else print 
//−
//1
//.
//
//Constraints
//1
//<=
//T
//<=
//10
//6
//
//1
//<=
//N
//<=
//2.5
//∗
//10
//6
//
//0
//<=
//A
//[
//i
//]
//<=
//2
//∗
//10
//6
//
//Time Limit
//1 second
//
//Example
//Input
//3
//7 0
//1 2 8 10 11 12 19
//7 5
//1 2 8 10 11 12 19
//7 10
//1 2 8 10 11 12 19
//
//Output
//-1
//1
//3