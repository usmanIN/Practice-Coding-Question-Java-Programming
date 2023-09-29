package Learning_Basic_DataStructures_Java;

public class permutateBacktrack {
	
	public static void permutateStr(String str,int idx ,String combine) {
		if(str.length()==0) {
			System.out.println(combine);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0,i)+ str.substring(i+1);
			permutateStr(newStr,idx+i,combine+currChar);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutateStr("ABC",0,"");
	}
}
