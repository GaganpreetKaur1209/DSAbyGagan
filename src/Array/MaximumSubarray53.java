package Array;

public class MaximumSubarray53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
System.out.println(maxSubArray(nums));
	}
public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int sum=0;	
        for(int i:nums) {
        	sum+=i;
        	//maxsum=Math.max(sum,maxsum);
            maxsum=(sum>maxsum)?sum:maxsum;
        	if(sum<0) 
        		sum=0;
        }
        return maxsum;
    }
}
