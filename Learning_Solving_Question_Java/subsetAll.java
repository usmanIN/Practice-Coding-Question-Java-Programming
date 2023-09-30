package Learning_Solving_Question_Java;

import java.util.ArrayList;
public class subsetAll {

	public static void subset(int n, ArrayList<Integer> arr) {
		if(n==0) {
			for(int i=0; i<arr.size(); i++) {
				System.out.print(arr.get(i)+" ");				
			}
			System.out.println();
			return;
		}
		
		// add hoga
		arr.add(n);
		subset(n-1, arr);
		
		// add nahi noga
		arr.remove(arr.size()-1);
		subset(n-1, arr);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		ArrayList<Integer> subset = new ArrayList<>();
		
		subset(n, subset);

	}

}
