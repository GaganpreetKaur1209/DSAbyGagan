package StreakChallenge;

import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI3264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,5,6};
		int k = 5;
		int multiplier = 2;
		System.out.println(Arrays.toString(getFinalState(nums,k,multiplier)));
	}
	public static int[] getFinalState(int[] nums, int k, int multiplier) {
		 while(k>0){
	            k--;
	            int minimum=nums[0];
	            int index=0;
	            for(int i=0;i<nums.length;i++){
	                if(minimum>nums[i]) {
	                	minimum=nums[i];                
	                 index=i;
	            }
	            }
	            nums[index]=minimum*multiplier;
	        }
	        return nums;
    }
}
