package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementinSortedArray34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,7,8,8,10};
		int target=8;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}
	  public static int[] searchRange(int[] nums, int target) {
	        int low=0;
	        int high=nums.length-1;
	        int ans[]=new int[2];
	        ans[0]=firstIndex(nums,low,high, target);
	        ans[1]=lastIndex(nums,low,high,target);
	        return ans;
	    }
	  public static int firstIndex(int[] nums,int low, int high, int target) {
		  int ans=-1;
		  while(low<=high) {
			  int mid=low+(high-low)/2;
			  if(nums[mid]<target) {
				  low=mid+1;
			  }
			  else if(nums[mid]>target) {
				  high=mid-1;
			  }
			  else {
				  ans=mid;
				  high=mid-1;
			  }
		  }
		  return ans;
	  }
	  public static int lastIndex(int[] nums,int low, int high, int target) {
		  int ans=-1;
		  while(low<=high) {
			  int mid=low+(high-low)/2;
			  if(nums[mid]<target) {
				  low=mid+1;
			  }
			  else if(nums[mid]>target) {
				  high=mid-1;
			  }
			  else {
				  ans=mid;
				  low=mid+1;
			  }
		  }
		  return ans;
	  }
}
