package BinarySearch;

public class FindMinimumInASortedArray153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]  nums = {3,4,5,1,2};
System.out.println(findMin(nums));
	}
public static int findMin(int[] nums) {
	if(nums.length==1)
		return nums[0];
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(nums[low]<nums[mid]) {
        		ans=Math.min(nums[low], ans);
        		low=mid+1;
        	}
        	else {
        		ans=Math.min(ans,nums[mid]);
        		high=mid-1;
        	}
        }
  
        return ans;
    }
}
