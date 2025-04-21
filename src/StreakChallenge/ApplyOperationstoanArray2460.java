package StreakChallenge;

import java.util.Arrays;

public class ApplyOperationstoanArray2460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,1,1,0};
		System.out.println(Arrays.toString(applyOperations(nums)));
	}
	 public static int[] applyOperations(int[] nums) {
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]==nums[i+1]){
	                nums[i]=nums[i]*2;
	                nums[i+1]=0;
	            }
	        }
	        int i=0;
	        int j=0;
	        while(i<nums.length && j<nums.length){
	            if(nums[j]!=0 && nums[i]!=0){
	                i++;
	                j++;
	            }
	            else if(nums[j]==0 )
	            j++;
	            else if(nums[j]!=0 && nums[i]==0){
	                int temp=nums[j];
	                nums[j]=nums[i];
	                nums[i]=temp;
	                i++;
	                j++;
	            }
	        }
	        return nums;
	    }
	}