package StreakChallenge;

import java.util.ArrayList;
import java.util.List;

public class ConstructtheMinimumBitwiseArrayI3314Day6 {
	 public static void main(String[] args) {
	        List<Integer> nums = new ArrayList<>();
	        nums.add(2);
	        nums.add(3);
	        nums.add(5);
	        nums.add(7);
	        int[] result = minBitwiseArray(nums);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	 }
	 public static int[] minBitwiseArray(List<Integer> nums) {
	        int n = nums.size();
	        int[] ans = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            int num = nums.get(i);
	            boolean found = false;
	            
	            for (int j = 0; j < num; j++) {
	                if ((j | (j + 1)) == num) {
	                    ans[i] = j;
	                    found = true;
	                    break;
	                }
	            }
	            
	            if (!found) {
	                ans[i] = -1;
	            }
	        }
	        
	        return ans;
	 }
}
