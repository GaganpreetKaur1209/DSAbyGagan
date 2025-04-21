package Array;

public class MaximumProductSubarray152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {2,3,-2,4};
//		int nums[]= {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
System.out.println(maxProduct(nums));
	}
	 public static int maxProduct(int[] nums) {
	      int result=nums[0];
	      int prefix=1;
	      int suffix=1;
	      for(int i=0;i<nums.length;i++) {
	    	  if(prefix==0)
	    		  prefix=1;
	    	  if(suffix==0)
	    		  suffix=1;
	    	  prefix*=nums[i];
	    	  suffix*=nums[nums.length-1-i];
	    	  result=Math.max(result,(Math.max(suffix, prefix)));
	      }
	      return result;
	    }
}
