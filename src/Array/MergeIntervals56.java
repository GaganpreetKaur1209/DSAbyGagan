package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
int result[][]=merge(intervals);
for (int i = 0; i < result.length; i++) {
    for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j] + " ");
}
    System.out.println();
	}
	}
	public static int[][] merge(int[][] intervals) {
		if(intervals.length<=1)
			return intervals;
		Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        int[] newInterval=intervals[0];
        List<int[]> result=new ArrayList<>();
        result.add( newInterval);
        for(int interval[]:intervals) {
        	if(newInterval[1]>=interval[0]) {
        		newInterval[1]=Math.max(newInterval[1], interval[1]);
        	}
        	else {
        		newInterval=interval;
        		result.add(newInterval);
        	}
        }
        return result.toArray(new int[result.size()][]);
    }

}
