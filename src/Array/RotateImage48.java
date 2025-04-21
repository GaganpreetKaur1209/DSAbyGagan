package Array;

public class RotateImage48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}}; 
		 int n=arr.length;
		rotate(arr);
		 for(int r=0;r<n;r++) {
	        	for(int c=0;c<n;c++) {
	        		System.out.print(arr[r][c]);
	        	}
	        	System.out.println();
		 }
	}
	 public static void rotate(int[][] matrix) {
	        int n=matrix.length;
	        int arr[][]=new int[n][n];
	        int x=0,y=n-1;
	        for(int r=0;r<n;r++) {
	        	for(int c=0;c<n;c++) {
	        		arr[x][y]=matrix[r][c];
	        		x++;
	        	}
	        			x=0;
	        			y--;
	        		}
	        for(int r=0;r<n;r++) {
	        	for(int c=0;c<n;c++) {
	        		matrix[r][c]=arr[r][c];
	        	}
	        }
	 }
}
