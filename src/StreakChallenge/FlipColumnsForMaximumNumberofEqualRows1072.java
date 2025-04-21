package StreakChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlipColumnsForMaximumNumberofEqualRows1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{0,1},{1,1}};
		System.out.println(maxEqualRowsAfterFlips(matrix));
	}
	 public static int maxEqualRowsAfterFlips(int[][] matrix) {
		 int ans=0;
	    	 Map<String,Integer> map=new HashMap<>();
	       for(int[] row:matrix) {
	    	   StringBuilder values=new StringBuilder();
	    	   StringBuilder flipped=new StringBuilder();
	    	   for(int r:row) {
	    		   values.append(r);
	    		   flipped.append(r^1);
	    	   }
	    	   String vs=values.toString();
	    	   String fs=flipped.toString();
	    	  map.put(vs, map.getOrDefault(vs, 0)+1); 
	    	  map.put(fs, map.getOrDefault(fs, 0)+1); 
	       }
	       for(int m:map.values()) {
	    	   ans=Math.max(ans, m);
	       }
	       return ans;
	    }
}
