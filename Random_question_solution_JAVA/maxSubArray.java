package Random_question_solution_JAVA;

public class maxSubArray {
	
	public static int recSubArr(int arr[],int start, int end) {
		
		if(start == end) return arr[end];
		
		int middle = (start+end) / 2;		
		int leftMax = recSubArr(arr,0, middle);
		int rightMax = recSubArr(arr, middle+1,end);
		
		int leftSum = Integer.MIN_VALUE;
		int rightSum = Integer.MIN_VALUE;
		int sum = 0;		
		for(int i= middle ; i>=start; i--) {
			sum = sum + arr[i];
			if(sum > leftSum) {
				leftSum = sum;
			}
		}
		sum = 0;
		for(int i= middle+1; i<=end;i++) {
			sum = sum + arr[i];
			if(rightSum< sum) {
				rightSum = sum;
			}
		}		
		return Math.max(leftSum+rightSum,Math.max(rightMax,rightSum));
	}
	
	public static int maxSubArr(int arr[]) {
		
		//if(arr.length == 0 || arr.length == 1) return arr;
		int max = Integer.MIN_VALUE;
		int end = 0;		
		for(int i=0; i<arr.length; i++) {
			end = end + arr[i];
			if(max < end) { max = end; }
			if(end < 0) { end = 0; }
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {-2,1,-3,4,-1,2,1,-5,4};
		int result = recSubArr(arr, 0, arr.length-1);//maxSubArr(arr);
		System.out.println("Max: "+ result);
		
	}

}
