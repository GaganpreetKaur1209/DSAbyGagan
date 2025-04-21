package StreakChallenge;

import java.util.HashMap;
import java.util.Map;

public class MaximumBeautyofanArrayAfterApplyingOperation2779 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,6,1,2};
		int k = 2;
		System.out.println(maximumBeauty(nums,k));

	}
public static int maximumBeauty(int[] nums, int k) {
	Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        	map.put(nums[i]-k, map.getOrDefault(nums[i]-k, 0)+1);
        	map.put(nums[i]+k, map.getOrDefault(nums[i]+k, 0)+1);
        }
        int max=0;
        for(Map.Entry<Integer, Integer> m:map.entrySet()) {
        	max=Math.max(max, m.getValue());
        }
        return max;
    }
}
