package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.swing.JList;

public class ThreeSum15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {-1,0,1,2,-1,-4};
		int nums[]= {0,0,0};
		System.out.println(threeSum(nums));
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> list=new ArrayList<List<Integer>>();
	       Arrays.sort(nums);
	       int i=0;
	  	       while(i<nums.length-2) {
	    	   int j=i+1;
	    	   int k=nums.length-1;
	    	   while(j<k) {
	    		   int sum=nums[i]+nums[j]+nums[k];
	    	    if(sum>0) {
	    			   k--;  
	    	   }
	    	    else if(sum<0) {
	    			   j++;  
	    	   }
	    	    else {
	    	    	 List<Integer> list2=new ArrayList<>();
	    		   list2.add(nums[i]);
	    		   list2.add(nums[j]);
	    		   list2.add(nums[k]);
	    		   list.add(list2);
	    	    	//list.add(Arrays.asList(nums[i], nums[j], nums[k]));
	    		   j++;
	    		   k--;
	    		   while(j< k&& nums[j]==nums[j-1])
	    			   j++;
	    		   
	    		   while(j<k && nums[k]==nums[k+1])
	    			   k--;
	    	   }   
	    	   }
	    	   i++;
	    	   while(i<nums.length-2 && nums[i]==nums[i-1])
	    		   i++;
	       }
	  	    return list;
	    }

}
