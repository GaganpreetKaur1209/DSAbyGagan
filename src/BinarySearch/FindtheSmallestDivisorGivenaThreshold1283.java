package BinarySearch;

public class FindtheSmallestDivisorGivenaThreshold1283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,2,5,9};
int threshold=6;
System.out.println(smallestDivisor(nums, threshold));
	}
	 public static int smallestDivisor(int[] nums, int threshold) {
		 int max=Integer.MIN_VALUE;
	        for(int i=0;i<=nums.length-1;i++) {
	        	max=Math.max(max, nums[i]);
	        }
	        int low=1;
	        int high=max;
	        int divisor=-1;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(check(nums,threshold,mid))
	        	{
	        		divisor=mid;
	        		high=mid-1;
	        	}
	        	else
	        	low=mid+1;
	        }
	        return divisor;
	    }
	 public static boolean check(int[] nums, int threshold, int mid) {
		 int ans=0;
		 for(int i=0;i<=nums.length-1;i++) {
     		ans+=(nums[i]+mid-1)/mid;
     	}
		return ans<=threshold;
	 }
}
