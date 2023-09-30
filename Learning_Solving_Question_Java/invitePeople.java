package Learning_Solving_Question_Java;


public class invitePeople {

	//ways of invites peoples in single or pairs
	public static int callPerson(int n) {
	
		if(n <= 1) {
			return 1;
		}
		return callPerson(n-1) + (n-1)*callPerson(n-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalWays = callPerson(4);
		System.out.println(totalWays);
	}

}
