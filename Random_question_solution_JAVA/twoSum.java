package Random_question_solution_JAVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static int[] twoSumArr(int[] nums, int target){
		
//		Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length - 1;
//        while(left < right) {
//            if(nums[left] + nums[right] == target) {
//                return new int[] {left, right};
//            } else if (nums[left] + nums[right] < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
		
			Map<Integer,Integer> numMap = new HashMap<>();
	        for(int i=0; i<nums.length; i++)
	        {
	            int diff = target - nums[i];
	            if(numMap.containsKey(diff)){
	                return new int[] {numMap.get(diff),i};
	            }else {
	            	numMap.put(nums[i], i);
	            }
	         }
			
	        return new int[] {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4};
		System.out.println(Arrays.toString(twoSumArr(arr,6)));
		
	}

}
