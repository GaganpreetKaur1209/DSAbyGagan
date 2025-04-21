package BinarySearch;

public class SingleElementInASortedArray540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]  nums = {1,1,2,3,3,4,4,8,8};
System.out.println(singleNonDuplicate(nums));
	}
	  public static int singleNonDuplicate(int[] nums) {
		  int n=nums.length-1;
	        if(nums.length==1)
	        	return nums[0];
	        else if(nums[0]!=nums[1])
	        	return nums[0];
	        else if(nums[n]!=nums[n-1])
	        	return nums[n];
	        int low=1;
	        int high=n-1;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
	        		return nums[mid];
	        	else if((mid%2==1 && nums[mid]==nums[mid-1])||(mid%2==0 && nums[mid]==nums[mid+1]))
	        			low=mid+1;
	        	else
	        		high=mid-1;
	        }
	        return -1;
	    }
}
