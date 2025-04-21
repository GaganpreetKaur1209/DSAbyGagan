package StreakChallenge;

import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRoworColumn2661 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2};
		int[][] mat = {{1,4},{2,3}};
		System.out.println(firstCompleteIndex(arr,mat));
	}
	 public static int firstCompleteIndex(int[] arr, int[][] mat) {
	        int m=mat.length;
	        int n=mat[0].length;
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            map.put(arr[i],i);
	        }
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<m;i++){
	            int rowmax=Integer.MIN_VALUE;
	            for(int j=0;j<n;j++){
	               int maxr=map.get(mat[i][j]);
	                rowmax=Math.max(maxr,rowmax);
	            }
	            min=Math.min(min,rowmax);
	        }
	        for(int i=0;i<n;i++){
	            int colmax=Integer.MIN_VALUE;
	            for(int j=0;j<m;j++){
	                int maxc=map.get(mat[j][i]);
	                colmax=Math.max(maxc,colmax);
	            }
	            min=Math.min(min,colmax);
	        }
	       return min;
	    }
	}