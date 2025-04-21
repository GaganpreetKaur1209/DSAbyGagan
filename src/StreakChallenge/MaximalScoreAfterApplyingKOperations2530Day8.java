package StreakChallenge;

import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations2530Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,10,3,3,3};
		int k = 3;
		System.out.println(maxKelements(nums,k));
	}
	 public static long maxKelements(int[] nums, int k) {
         PriorityQueue<Integer>pq = new PriorityQueue<>((a, b)->b-a);
    for(int x : nums)
    pq.offer(x);
    long score = 0; 
    while(!pq.isEmpty() && k>0)
    {
      score +=pq.peek();
      int x = (int)Math.ceil(pq.poll()/3.0);
      pq.add(x);
      k--;
    }
     return score;
    }
}
