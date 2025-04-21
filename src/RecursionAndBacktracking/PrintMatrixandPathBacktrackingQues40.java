package RecursionAndBacktracking;

import java.util.Arrays;

public class PrintMatrixandPathBacktrackingQues40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[][]= {{true,true,true},{true,false,true},{true,true,true}};
		int path[][]=new int[arr.length][arr[0].length];
		maze(arr,0,0,"",path,1);
	}
	public static void maze(boolean arr[][],int r,int c,String ans,int path[][],int step) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			path[r][c]=step;
			for(int i[]:path) {
			System.out.println(Arrays.toString(i));
			}
			System.out.println(ans);
			System.out.println();
			return;
		}
		if(!arr[r][c])
			return;
		arr[r][c]=false;
		path[r][c]=step;
		if(r<arr.length-1)
			maze(arr,r+1,c,ans+"D",path,step+1);
		if(c<arr[0].length-1)
			maze(arr,r,c+1,ans+"R",path,step+1);
		if(r>0)
			maze(arr,r-1,c,ans+"U",path,step+1);
		if(c>0)
			maze(arr,r,c-1,ans+"L",path,step+1);
		arr[r][c]=true;
		path[r][c]=0;
	}

}
