package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FourSum18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[]= {1,0,-1,0,-2,2};
//		int target=0;
		int nums[]= {1,0,-1,0,-2,2};
		int target=0;
		System.out.println(fourSum(nums,target));
	}
public static List<List<Integer>> fourSum(int[] nums, int target) {
	 Arrays.sort(nums);
     List<List<Integer>> list=new ArrayList<List<Integer>>();
   if (nums.length < 4 || (long)nums[0] + nums[1] + nums[2] + nums[3] > target)
         return list;
	 
	 int n=nums.length;
	 for(int i=0;i<n-3;i++) {
		 if(i>0 && nums[i]==nums[i-1])
			 continue;
		 for(int j=i+1;j<n-2;j++) {
			 if(j>i+1 && nums[j]==nums[j-1])
				 continue;
			 int k=j+1;
			 int l=n-1;
			 while(k<l) {
				 long sum=nums[i]+nums[j]+nums[k]+nums[l];
				 if(sum<target)
					 k++;
				 else if(sum>target)
					 l--;
				 else {
					 List<Integer> list2=new ArrayList<>();
		    		   list2.add(nums[i]);
		    		   list2.add(nums[j]);
		    		   list2.add(nums[k]);
		    		   list2.add(nums[l]);
		    		   list.add(list2);
		    		   k++;
		    		   l--;
		    		   while(k<l && nums[k]==nums[k-1])
		    			   k++;
		    		   while(k<l && nums[l]==nums[l+1])
		    			   l--;
				 }
			 }
		 }
	 }
	return list;	    }
	}