package Random_question_solution_JAVA;

//import java.util.Arrays;

public class reverseString {

	public static void reverseWordString(String text) {
		
		String[] str= text.split(" ");		
		String result = "";
		for(int i = str.length-1; i>=0; i--) {
			
			 result =  str[i]+ " " + result;
		}
		System.out.println(result);
	}
	public static void reverse_String(String text) {
		
//		char[] strArr= text.toCharArray();		
//		
//		for(int i = 0 ; i<(strArr.length)/2; i++) {
//			char temp = strArr[strArr.length-i-1];
//				strArr[strArr.length - i -1] = strArr[i];
//				strArr[i] = temp;
//			 
//		}
//		String  result = "";
//		for(int i=0; i<strArr.length;i++) {
//			result = result + strArr[i];
//		}
		char temp;
		String result = "";
		for(int i=0; i<text.length(); i++) {
			temp = text.charAt(i);
			result = temp+result;
		}
		
		System.out.println(result);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_String("usmanj");
	}

}
