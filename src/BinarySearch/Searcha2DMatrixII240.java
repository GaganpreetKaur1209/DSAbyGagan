package BinarySearch;

public class Searcha2DMatrixII240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target=5;
		System.out.println(searchMatrix(arr,target));
	}
public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        while(row<n && col>=0) {
        	if(matrix[row][col]==target)
        		return true;
        	else if(matrix[row][col]<target)
        		row++;
        	else
        		col--;
        }
        return false;
    }
}