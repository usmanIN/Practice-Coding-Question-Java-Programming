package ArrayQuestion;

import java.util.Arrays;

public class longestConsecutiveSquence {
	
	public static boolean linearSearch(int[] nums, int x) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==x) return true;
		}
		return false;
	}
	public static void longConsecutiveSequence(int[] nums)
	{
		int max = 1;
		for(int i=0; i<nums.length; i++)
		{
			int count = 1;
			int current = nums[i];
			while(linearSearch(nums,current+1)) {
				current+=1;
				count+=1;
			}			
			max = Math.max(max, count);		
		}
		System.out.println("Longest Length: "+ max);
	}
	
	public static void longConApprochTwo(int[] nums)
	{
		Arrays.sort(nums);
		int longest = 1;
		int current = nums[0];
		int count = 1;
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i] == current+1) {
				current = current+1;
				count = count +1;				
			}else if(nums[i]>current+1){
				current = nums[i];
				count = 1;
			}
			longest = Math.max(longest, count);
		}
		System.out.println(longest);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 200, 1, 2, 3, 4,8,7,9,10,11};//{3, 8, 5, 7, 6};
		
//		longConsecutiveSequence(arr);
		longConApprochTwo(arr);

	}

}
