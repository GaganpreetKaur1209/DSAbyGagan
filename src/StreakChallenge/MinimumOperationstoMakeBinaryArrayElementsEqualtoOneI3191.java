package StreakChallenge;

public class MinimumOperationstoMakeBinaryArrayElementsEqualtoOneI3191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,1,1,0,0};
		System.out.println(minOperations(nums));
	}
	 public static int minOperations(int[] nums) {
	        int count=0;
	        for(int num=0;num<nums.length-2;num++){
	            if(nums[num]==0){
	                    nums[num]=nums[num]^1;
	                   nums[num+1]=nums[num+1]^1;
	                    nums[num+2]=nums[num+2]^1;
	                    count++;
	                }
	        }
	        if(nums[nums.length-1]==0 || nums[nums.length-2]==0)
	        return -1;
	        return count;
	    }
	}