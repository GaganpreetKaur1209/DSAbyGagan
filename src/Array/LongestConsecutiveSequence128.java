package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {100,4,200,1,3,2};
		System.out.println(longestConsecutive(nums));
	}
	 public static int longestConsecutive(int[] nums) {
		  if(nums.length==0)
		        return 0;
		 Set<Integer> set=new HashSet<>();
		 int count=1;
		 int longest=1;
		 for(int i:nums) {
			 set.add(i);
		 }
		 for(int i:set) {
			 if (set.contains(i - 1)) {
		            continue;
		        }
			 while(set.contains(i+count)) {
				 count++;
			 }	 
			 longest=Math.max(count, longest);
			 count=1;
		 }
		 return longest;
	    }
}