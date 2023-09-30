package Learning_Solving_Question_Java;


public class permutation_recursion {
	
	public static void per_rec(String str, String per) {
		if(str.length() == 0) {
			System.out.println(per);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			per_rec(newstr,per+temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		per_rec("abc","");
	}

}
