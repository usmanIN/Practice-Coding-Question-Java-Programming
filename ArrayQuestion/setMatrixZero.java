package ArrayQuestion;

public class setMatrixZero {
	
	public static void updateArray(int[][] matrix, int row,int col)
	{	
		int i = 0;
		//update column
		while(i<matrix[col].length)
		{
			matrix[row][i] = -1;
			i++;
		}
		
		//update rows
		i=0;
		while(i<matrix.length) {
			matrix[i][col] = -1;
			i++;
		}
	}
	public static void setZeroes(int[][] matrix) {
		if(matrix.length == 0) return;
		int[][] prev = new int[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[i].length; j++)
				prev[i][j] = matrix[i][j];
		
		for(int i=0; i<prev.length;i++)
		{
			for(int j=0;j<prev[i].length;j++)
			{
				if(matrix[i][j]==0) {
					updateArray(matrix, i,j);
				}
			}
		}
	}
	
	public static void setZeroApprochTwo(int[][] matrix)
	{
		if(matrix.length == 0) return;
		int[] rows = new int[matrix.length];
		int[] cols= new int[matrix[0].length];
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
				if(matrix[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
				if(rows[i] == 1  || cols[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1,1,1},{1,0,1,0},{1,1,1,1}};
//		setZeroes(arr);
		setZeroApprochTwo(arr);
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]== -1) {
					arr[i][j] =0;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
	