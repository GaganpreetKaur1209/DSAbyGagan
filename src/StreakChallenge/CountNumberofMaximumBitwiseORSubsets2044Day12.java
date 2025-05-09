package StreakChallenge;

public class CountNumberofMaximumBitwiseORSubsets2044Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1};
		System.out.println(countMaxOrSubsets(nums));
	}
	public static void backtrack(int[] nums, int index, int currentOR, int maxOR, int[] count) {
        if (currentOR == maxOR) {
            count[0]++;
        }

        for (int i = index; i < nums.length; i++) {
            backtrack(nums, i + 1, currentOR | nums[i], maxOR, count);
        }
    }

    public static int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;

        // Step 1: Compute the maximum OR
        for (int num : nums) {
            maxOR |= num;
        }

        int[] count = new int[1];
        // Step 2: Backtrack to count the subsets
        backtrack(nums, 0, 0, maxOR, count);

        return count[0];
    }
}
