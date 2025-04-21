package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3};
		System.out.println(subsets(nums));
	}
	 public static List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> list=new ArrayList<>();
		 List<Integer> ans=new ArrayList<>();
		 generatesubset(list,nums,ans,0);
		 return list;
	    }
	 public static void generatesubset(List<List<Integer>> list, int nums[], List<Integer> ans, int n ){
		 if(nums.length==n) {
			 list.add(new ArrayList<>(ans));
			 return ;
		 }	 
		 ans.add(nums[n]);
		 generatesubset(list, nums,ans, n+1);
		 ans.remove(ans.size() - 1);
		 generatesubset(list, nums, ans, n+1);
		 
	 }
	
}
