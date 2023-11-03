package Random_question_solution_JAVA;
import java.util.Arrays;
public class checkAnagram {
	   
	  public static boolean check_Anagram(String str1, String str2){
	      if(str1.length() != str2.length()) return false;
	      char strArr1[] = str1.toCharArray();
	      char strArr2[] = str2.toCharArray();
	      Arrays.sort(strArr1); 
	      Arrays.sort(strArr2);
	      
	      for(int i=0; i<strArr1.length; i++) {
	    	  if(strArr1[i] != strArr2[i]){
		          return false;
		      }  
	      }
	      
	      return true;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean status = check_Anagram("silent","listen");
	        if(status){
	            System.out.println("Anangram");
	        }else{
	            System.out.println("Not Anagram");
	        }
	}

}
