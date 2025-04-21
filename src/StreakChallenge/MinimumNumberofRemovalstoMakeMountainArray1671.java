package StreakChallenge;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberofRemovalstoMakeMountainArray1671 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,1,5,6,2,3,1};
		System.out.println(minimumMountainRemovals(nums));
	}
public static int minimumMountainRemovals(int[] nums) {
	 int[] dp=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int max=1;
			for(int j=i-1;j>=0;j--) {
				if(nums[i]>nums[j]) 
					max=Math.max(max, dp[j]+1);
					
			}
			dp[i]=max;
		}
		int[] dp2=new int[nums.length];
		for(int i=nums.length-1;i>0;i--) {
			int max=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) 
					max=Math.max(max, dp2[j]+1);
					
			}
			dp2[i]=max;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(dp[i]!=1 && dp2[i]!=1)
	        min=Math.min(min,nums.length-(dp[i]+dp2[i]-1));
		}
		return min;
    }
}
