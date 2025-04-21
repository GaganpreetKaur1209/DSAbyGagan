package BinarySearch;

public class SearchInsertPosition35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,3,5,6};
int target=5;
//int target=2;
//int target=7;
System.out.println(searchInsert(nums,target));
	}
	 public static int searchInsert(int[] nums, int target) {
	        int low=0;
	        int high=nums.length-1;
	        int ans=-1;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(nums[mid]>=target) {
	        			ans=mid;
	        			high=mid-1;
	        	}
	        	else if(nums[mid]<target) {
	        		low=mid+1;
	        		ans=low;
	        	}
	        }
	        return ans;
	    }

}
