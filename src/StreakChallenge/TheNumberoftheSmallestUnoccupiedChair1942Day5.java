package StreakChallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TheNumberoftheSmallestUnoccupiedChair1942Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] times = {{1,4},{2,3},{4,6}};
		int targetFriend = 1;
		System.out.println(smallestChair(times,targetFriend));
	}
	 public static int smallestChair(int[][] times, int targetFriend) {
         int n = times.length;
        Integer[] order = new Integer[n];
        
        for (int i = 0; i < n; i++) order[i] = i;

        Arrays.sort(order, (a, b) -> Integer.compare(times[a][0], times[b][0]));

        PriorityQueue<Integer> emptySeats = new PriorityQueue<>();
        PriorityQueue<int[]> takenSeats = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) emptySeats.offer(i);

        for (int i : order) {
            int arrival = times[i][0], leave = times[i][1];

            while (!takenSeats.isEmpty() && takenSeats.peek()[0] <= arrival) {
                emptySeats.offer(takenSeats.poll()[1]);
            }

            int seat = emptySeats.poll();

            if (i == targetFriend) return seat;

            takenSeats.offer(new int[]{leave, seat});
        }

        return -1;
    }
}
