package Array;

public class MaximumConsecutiveOnes485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
		 int c=0;
		 int ans=0;
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]==1) 
	        		c++;
	        	
	        	else {
	        		//ans=Math.max(ans, c);
	        		c=0;
	        	}
	        	ans=Math.max(ans, c);
        		
	        }
	        return ans;
	    }
}
