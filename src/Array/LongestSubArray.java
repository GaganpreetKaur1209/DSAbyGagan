package Array;

import java.util.HashMap;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
int n=arr.length;
int k=15;
System.out.println(lenOfLongSubarr(arr,n,k));
	}
	 public static int lenOfLongSubarr (int arr[], int n, int k) {
 
		 HashMap<Integer,Integer> map=new HashMap<>();
		 int currSum=0;
		 int ans=0;
		 for(int i=0;i<arr.length;i++) {
			 currSum+=arr[i];
			 if(currSum==k) {
				 ans=Math.max(ans, i+1);
			 }
			 if(!map.containsKey(currSum)) {
				 map.put(currSum, i);
			 }
			 if(map.containsKey(currSum-k)) {
				 ans=Math.max(ans, i-map.get(currSum-k));
			 }
			 
		 }
		 return ans;
	 }

}
