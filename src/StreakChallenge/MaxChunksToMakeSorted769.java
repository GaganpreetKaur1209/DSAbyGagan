package StreakChallenge;

import java.util.Stack;

public class MaxChunksToMakeSorted769 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,0,1};
		System.out.println(maxChunksToSorted(arr));
	}
	  public static int maxChunksToSorted(int[] arr) {
		  if (arr == null || arr.length == 0)
	            return 0;

	        int count = 0, max = 0;
	        for (int i = 0; i < arr.length; i++) {
	            max = Math.max(max, arr[i]);
	            if (max == i)
	                count++;
	        }

	        return count;
	    }
}
