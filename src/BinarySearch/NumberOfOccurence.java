package BinarySearch;

public class NumberOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,1,2,2,2,2,3};
		int n=7;
		int target=2;
		System.out.println(count(nums,n,target));
	}
	 static int count(int[] arr, int n, int x) {
	        // code here
		 int low=0;
	        int high=n-1;
	       int ans1=firstIndex(arr,low,high, x);
	       if(ans1==-1)
	       return 0;
	        int ans2=lastIndex(arr,low,high,x);
	        return ans2-ans1+1;
	    }
	  public static int firstIndex(int[] nums,int low, int high, int target) {
		  int ans=-1;
		  while(low<=high) {
			  int mid=low+(high-low)/2;
			  if(nums[mid]<target) {
				  low=mid+1;
			  }
			  else if(nums[mid]>target) {
				  high=mid-1;
			  }
			  else {
				  ans=mid;
				  high=mid-1;
			  }
		  }
		  return ans;
	  }
	  public static int lastIndex(int[] nums,int low, int high, int target) {
		  int ans=-1;
		  while(low<=high) {
			  int mid=low+(high-low)/2;
			  if(nums[mid]<target) {
				  low=mid+1;
			  }
			  else if(nums[mid]>target) {
				  high=mid-1;
			  }
			  else {
				  ans=mid;
				  low=mid+1;
			  }
		  }
		  return ans;
	    }
}
