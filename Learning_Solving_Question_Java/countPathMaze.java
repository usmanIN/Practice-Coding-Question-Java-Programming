package Learning_Basic_DataStructures_Java;

public class countPathMaze {
	
	public static int countPath(int i, int j, int n, int m) {
		
		if(i==n || j==m) {
			return 0;
		}
		if(i==n-1 && j==n-1) {
			return 1;
		}
		
		//move down path
		int downPath = countPath(i+1,j,n,m);
		//move right path
		int rightPath = countPath(i,j+1,n,m);
		
		return downPath + rightPath;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalPath = countPath(0,0,3,3);
		System.out.println(totalPath);
	}

}
