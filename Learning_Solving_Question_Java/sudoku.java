package Learning_Basic_DataStructures_Java;

public class sudoku {
	
	public static boolean check(int[][] arr, int row, int col, int value) {
		
		
		//horizontal- col-wise
		for(int i=0; i<arr[0].length; i++) {
			if(arr[i][col]==value) {
				return false;
			}
		}
		//vertical - row-wise
		for(int j=0; j<arr[0].length; j++) {
			if(arr[row][j]==value) {
				return false;
			}
		}
		
		//grid-wise
		int sr = (row/3)*3;
		int sc = (col/3)*3;
		for(int i=sr; i<sr+3; i++) {
			for(int j=sc; j<sc+3; j++) {
				if(arr[sr][sc]==value) {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	public static boolean helper(int[][] arr, int row, int col) {
		if(row == arr[0].length) {
			return true;
		}
		int newrows = 0;
		int newcols = 0;
		if(col == arr[0].length-1) {
			newrows = row + 1;
			newcols = 0;
		}else {
			newrows = row;
			newcols = col + 1;
		}
		if(arr[row][col] != 0) {
			if(helper(arr,newrows,newcols)) {
				return true;
			}
		}else {
			for(int i=1; i<=arr[0].length; i++) {
				if(check(arr,row,col,i)) {
					arr[row][col] = i;
					if(helper(arr,newrows,newcols)) {
						return true;
					}else {
						arr[row][col] = 0;
					}
				}
			} 
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 9;
		int arr[][] =  { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		
		if(helper(arr,0,0)) {
		for(int i=0;i<size; i++) {
			for(int j=0;j<size; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		}
		
		
		
	}

}
