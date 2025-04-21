package StreakChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumSumofDistinctSubarraysWithLengthK2461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,1,1,7,8,9};
		int k=3;
		System.out.println(maximumSubarraySum(nums,k));
	}
public static long maximumSubarraySum(int[] nums, int k) {
	  int n = nums.length;
      Set<Integer> elements = new HashSet<>();
      long currentSum = 0;
      long maxSum = 0;
      int begin = 0;
      
      for (int end = 0; end < n; end++) {
          if (!elements.contains(nums[end])) {
              currentSum += nums[end];
              elements.add(nums[end]);
              
              if (end - begin + 1 == k) {
                  maxSum = Math.max(maxSum, currentSum);
                  currentSum -= nums[begin];
                  elements.remove(nums[begin]);
                  begin++;
              }
          } else {
              while (nums[begin] != nums[end]) {
                  currentSum -= nums[begin];
                  elements.remove(nums[begin]);
                  begin++;
              }
              begin++;
          }
      }
      
      return maxSum;
    }

}
