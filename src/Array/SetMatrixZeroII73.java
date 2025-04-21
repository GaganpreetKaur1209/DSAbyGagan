package Array;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

public class SetMatrixZeroII73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,1,1},{1,0,1},{1,1,1}};
setZeroes(arr);
for(int r=0;r<arr.length;r++) {
	for(int c=0;c<arr[0].length;c++) {
		System.out.print(arr[r][c]);
	}
	System.out.println();
}
	}
public static void setZeroes(int[][] matrix) {
	boolean row[]=new boolean[matrix.length];
	boolean col[]=new boolean[matrix[0].length];
	for(int r=0;r<matrix.length;r++) {
		for(int c=0;c<matrix[0].length;c++) {
			if(matrix[r][c]==0) {
				row[r]=true;
				col[c]=true;
			}
		}
	}
	for(int r=0;r<row.length;r++) {
		if(row[r]) {
			for(int c=0;c<matrix[0].length;c++) {
				matrix[r][c]=0;
			}
		}
	}
	for(int c=0;c<col.length;c++) {
		if(col[c]) {
			for(int r=0;r<matrix.length;r++) {
				matrix[r][c]=0;
			}
		}
	}
    }
}
