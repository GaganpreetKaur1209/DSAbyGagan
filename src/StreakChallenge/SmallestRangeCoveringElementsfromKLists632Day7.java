package StreakChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeCoveringElementsfromKLists632Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(10);
        nums.add(15);
        nums.add(24);
        nums.add(26);
        list.add(nums);
        List<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(9);
        num.add(12);
        num.add(20);
        list.add(num);
        List<Integer> numss = new ArrayList<>();
        numss.add(5);
        numss.add(18);
        numss.add(22);
        numss.add(30);
        list.add(numss);
		int[] result = smallestRange(list);
        for (int numsss : result) {
            System.out.print(numsss + " ");
        }
	}
	 public static int[] smallestRange(List<List<Integer>> nums) {
	      // Min-Heap: stores (value, list index, element index)
	        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
	        int curMax = Integer.MIN_VALUE;

	        // Initialize the heap with the first element of each list
	        for (int i = 0; i < nums.size(); i++) {
	            minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
	            curMax = Math.max(curMax, nums.get(i).get(0));
	        }

	        // Track the smallest range
	        int[] smallRange = new int[]{0, Integer.MAX_VALUE};

	        while (true) {
	            // Get the minimum element from the heap
	            int[] curr = minHeap.poll();
	            int curMin = curr[0], listIdx = curr[1], elemIdx = curr[2];

	            // Update the smallest range if a better one is found
	            if ((curMax - curMin < smallRange[1] - smallRange[0]) ||
	                (curMax - curMin == smallRange[1] - smallRange[0] && curMin < smallRange[0])) {
	                smallRange[0] = curMin;
	                smallRange[1] = curMax;
	            }

	            // Move to the next element in the same list
	            if (elemIdx + 1 < nums.get(listIdx).size()) {
	                int nextVal = nums.get(listIdx).get(elemIdx + 1);
	                minHeap.offer(new int[]{nextVal, listIdx, elemIdx + 1});
	                curMax = Math.max(curMax, nextVal);
	            } else {
	                // If any list is exhausted, stop
	                break;
	            }
	        }
	        return smallRange;   
	    }
}
