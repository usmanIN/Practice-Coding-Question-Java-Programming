	package ArrayQuestion;

public class reArrangePN {

	
	public static void rearrangeArray(int[] nums) {

		int[] arr = new int[nums.length/2];
		int[] brr = new int[nums.length/2];
		int  ai = 0, bi = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]>0) {
				arr[ai]=nums[i];
				ai++;
			}else {
				brr[bi]=nums[i];
				bi++;
			}
		}
		
		for(int i=0; i<nums.length/2; i++)
		{
			nums[2*i]=arr[i];
			nums[2*i+1]=brr[i];
		}					
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,-2,-5,2,-4};
		rearrangeArray(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

}
