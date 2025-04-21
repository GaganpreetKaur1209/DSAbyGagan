package StreakChallenge;

public class NumberofWaystoSplitArray2270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,4,-8,7};
		System.out.println(waysToSplitArray(nums));
	}
	 public static int waysToSplitArray(int[] nums) {
	        long startsum=0;
	        long sum=0;
	        int count=0;
	        for(int i:nums){
	            sum+=i;
	        }
	         int i=0;
	        while(i<nums.length-1){
	            startsum=startsum+nums[i];
	            sum=sum-nums[i];
	            if(startsum>=sum)
	            count++;
	            i++;
	        }
	        return count;
	    }
}
