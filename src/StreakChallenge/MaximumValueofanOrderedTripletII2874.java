package StreakChallenge;

public class MaximumValueofanOrderedTripletII2874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,6,1,2,7};
		System.out.println(maximumTripletValue(nums));
	}
	 public static long maximumTripletValue(int[] nums) {
		   long ans=0;
	        int n=nums.length;
	        int left[]=new int[n];
	        left[0]=nums[0];
	        int right[]=new int[n];
	        right[n-1]=nums[n-1];
	        for(int i=1;i<n;i++){
	            left[i]=Math.max(left[i-1],nums[i]);
	        }
	        for(int k=n-2;k>=0;k--){
	           right[k]=Math.max(right[k+1],nums[k]);
	        }
	        for(int j=1;j<nums.length-1;j++){
	            int l=left[j-1];
	            int r=right[j+1];
	            ans=Math.max(ans, (long)(l-nums[j])*r);
	        }
	        return ans;
	    }
	}