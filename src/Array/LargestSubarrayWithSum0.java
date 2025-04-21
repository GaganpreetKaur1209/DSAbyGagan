package Array;

import java.util.HashMap;

public class LargestSubarrayWithSum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {15,-2,2,-8,1,7,10,23};
int n = 8;
System.out.println(maxLen(arr,n));
	}
	 public static int maxLen(int arr[], int n)
	    {
	        // Your code here
		 HashMap<Integer,Integer> map=new HashMap<>();
		 int c=0;
		 int max=0;
		 int sum=0;
		 for(int i=0;i<n;i++) {
			 sum+=arr[i];		
			 if(sum==0) 
				 max=i+1;
			 else  {
			  if(map.containsKey(sum)) {
				 c=i-map.get(sum);
				 max=Math.max(max,c);
			  }
			  else
				  map.put(sum, i);
			 }
			 
			
			 		 
	    }
		 return max;
	}
}
