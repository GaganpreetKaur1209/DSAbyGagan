package StreakChallenge;

import java.util.Arrays;

public class MaximumXORforEachQuery1829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {0,1,1,3};
		 int maximumBit = 2;
		 System.out.println(Arrays.toString(getMaximumXor(nums,maximumBit)));
	}
public static int[] getMaximumXor(int[] nums, int maximumBit) {
     int bit=(1<<maximumBit)-1;
     int n=nums.length;
     int arr[]=new int[n];
     int xor=0;
     for(int i:nums) {
    	 xor=xor^i;
     }
     for(int i=0;i<n;i++) {
    	 arr[i]=xor^bit;
    	 xor=xor^nums[n-i-1];
     }
     return arr;
    }
}
