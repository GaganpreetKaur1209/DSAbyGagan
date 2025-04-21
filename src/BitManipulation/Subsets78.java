package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3};
		System.out.println(subsets(nums));
	}
	 public static List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> list=new ArrayList<List<Integer>>();
	        int n=nums.length;
	        int subset=1<<n;
	        for(int i=0;i<subset;i++) {
	        	List<Integer> ans=new ArrayList<Integer>();
	        	for(int j=0;j<n;j++) {
	        		if((i&(1<<j))!=0) 
                         ans.add(nums[j]);
	        	}
	        	list.add(ans);
	        }
	      return list;  
	 }
}
