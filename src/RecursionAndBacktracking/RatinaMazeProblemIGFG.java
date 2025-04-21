package RecursionAndBacktracking;

import java.util.ArrayList;

public class RatinaMazeProblemIGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		System.out.println(findPath(mat));
	}
	 public static ArrayList<String> findPath(int mat[][]) {
		 ArrayList<String> list=new ArrayList<>();
		 path(list,mat,0,0,"");
		 return list;  
	    }
	private static void path(ArrayList<String> list, int[][] mat, int i, int j, String s) {
		if(i==mat.length-1 && j==mat[0].length-1) {
			list.add(s);
			return;
		}
		 if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0) {
	            return;
	        }
		mat[i][j]=0;
			path(list, mat, i+1, j,s+"D");
			path(list, mat, i, j-1,s+"L");
			path(list, mat, i, j+1,s+"R");
			path(list, mat, i-1, j,s+"U");
		
		mat[i][j]=1;
	}
}
