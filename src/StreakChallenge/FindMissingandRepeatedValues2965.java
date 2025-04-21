package StreakChallenge;

import java.util.Arrays;

public class FindMissingandRepeatedValues2965 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3},{2,2}};
		System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
	}
	 public static int[] findMissingAndRepeatedValues(int[][] grid) {
	        int n=grid.length*grid.length;
	        int arr[]=new int[n+1];
	        int ans[]=new int[2];
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid.length;j++){
	                int no=grid[i][j];
	                arr[no]++;
	            }
	        }
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]==0)
	            ans[1]=i;
	            if(arr[i]==2)
	            ans[0]=i;
	        }
	        return ans;
	    }
	}