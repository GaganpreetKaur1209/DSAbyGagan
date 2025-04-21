package StreakChallenge;

public class MaximumValueofanOrderedTripletI2873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,6,1,2,7};
		System.out.println(maximumTripletValue(nums));
	}
	 public static long maximumTripletValue(int[] nums) {
	        long max=0;
	        for(int i=0;i<nums.length-2;i++){
	            for(int k=nums.length-1;k>i;k--){
	                int j=i+1;
	                while(j<k){
	                    max=Math.max(max, (long)(nums[i]-nums[j])*nums[k]);
	                    j++;
	                }
	            }
	        }
	        return max;
	    }
	}