package Learning_Basic_DataStructures_Java;

public class nqueenProblem {
	
	public static void printMax(int[][] arr,int length) {
		for(int i=0; i<length;i++) {
			for(int j=0; j<length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();			
		}
		System.out.println();
	}
	
	public static boolean check(int[][] arr, int rows, int cols,int size) {
		//horizontal
		for(int i=0;i<size; i++) {
			if(arr[rows][i]==1) {
				return false;
			}
		}
		//vertical
		for(int i=0; i<size; i++) {
			if(arr[i][cols]==1) {
				return false;
			}
		}
			
		// upper left
		int r=rows;
		for(int c=cols; c>=0 && r>=0; c--,r--) {
			if(arr[r][c]==1) {
				return false;
			}
		}
		// upper right
		r = rows;
		for(int c=cols; r>=0&&c<size; r--, c++ ) {
			if(arr[r][c]==1){
				return false;
			}
		}
		// down left
		r = rows;
		for(int c=cols; c>=0&&r<size; c--, r++) {
			if(arr[r][c]==1) {
				return false;
			}
		}
		// down right
		for(int c=cols; c<size&&r<size; c++,r++) {
			if(arr[r][c]==1) {
				return false;
			}
			
		}
		return true;
	}

	public static void queenSolver(int[][] arr, int col, int length) {
	
		if(col == length) {
			printMax(arr,length);
			return;
		}
			for(int rows=0; rows<length; rows++) {
				if(check(arr,rows,col,length)) {
					arr[rows][col] = 1;
					queenSolver(arr,col+1,length);
					arr[rows][col] = 0;					
				}
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 4;
		int[][] arr = new int[size][size];
		
//		for(int i=0; i<size; i++) {
//			for(int j=0; j<size; j++) {
//				arr[i][j] = 0;
//			}
//		}
		
		queenSolver(arr,0,size);
		

	}
	

}
