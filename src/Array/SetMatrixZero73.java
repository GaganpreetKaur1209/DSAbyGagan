package Array;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

public class SetMatrixZero73 {

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
	List<Integer> x=new ArrayList<>();
	List<Integer> y=new ArrayList<>();
	for(int r=0;r<matrix.length;r++) {
		for(int c=0;c<matrix[0].length;c++) {
			if(matrix[r][c]==0) {
				x.add(r);
				y.add(c);
			}
		}
	}
		for(int r=0;r<x.size();r++) {
			int index=x.get(r);
			for(int c=0;c<matrix[0].length;c++) {
				matrix[index][c]=0;
			}
		}
		for(int c=0;c<y.size();c++) {
			int index=y.get(c);
			for(int r=0;r<matrix.length;r++) {
				matrix[r][index]=0;
			}
		}
    }
}
