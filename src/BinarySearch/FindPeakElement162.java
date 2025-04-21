package BinarySearch;

public class FindPeakElement162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(findPeakElement(nums));
	}
	 public static int findPeakElement(int[] nums) {
		 int n=nums.length-1;
	        if(nums.length==1)
	        	return 0;
	        else if(nums[0]>nums[1])
	        	return 0;
	        else if(nums[n]>nums[n-1])
	        	return n;
	        int low=1;
	        int high=n-1;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
	        		return mid;
	        	else if(nums[mid]<nums[mid-1])
	        		high=mid-1;
	        	else 
	        		low=mid+1;
	        	}
	        return -1;
	    }
}
