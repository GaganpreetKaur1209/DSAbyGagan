package BinarySearch;

public class SplitArrayLargestSum410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {7,2,5,10,8};
		int k=2;
		System.out.println(splitArray(nums,k));
	}
public static int splitArray(int[] nums, int k) {
	int low=0;
	int high=0;
	int ans=-1;
        for(int i=0;i<nums.length;i++) {
        	low=Math.max(low, nums[i]);
			high+=nums[i];
        }
        	while(low<=high) {
        		int mid=low+(high-low)/2;
                if(divide(nums,mid)<=k)
                	{
                	ans=mid;
                	high=mid-1;
                	}
        		else
        			low=mid+1;
        }
        return ans;
    }
public static int divide(int nums[],int mid) {
	int sum=0;
	int count=1;
	for(int i=0;i<nums.length;i++) {
		if(sum+nums[i]<=mid) {
			sum+=nums[i];
		}
		else {
			count++;
			sum=nums[i];
		}
	}
	return count;
}
}
