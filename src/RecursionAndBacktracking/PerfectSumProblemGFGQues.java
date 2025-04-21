package RecursionAndBacktracking;

public class PerfectSumProblemGFGQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,33,42,32,10,14,12};
		int target = 19;
		System.out.println(perfectSum(arr,target));
	}
	 public static int perfectSum(int[] nums, int target) {
	       return checkSum(nums,target,0,0);
	    }
	 public static int checkSum(int[] nums, int target, int index,int ans) {
		 if(index==nums.length) {
			if(ans==target)
				return 1;
			else 
				return 0;
		 }		 
		 int n=nums[index];
		 int count1=checkSum(nums,target,index+1,ans);
		 int count2=checkSum(nums,target,index+1,ans+n);
		 return count1+count2;
	 }
}
