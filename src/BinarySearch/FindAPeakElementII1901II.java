package BinarySearch;

import java.util.Arrays;

public class FindAPeakElementII1901II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{41,8,2,48,18},{16,15,9,7,44},{48,35,6,38,28},{3,2,14,15,33},{39,36,13,46,42}};
		System.out.println(Arrays.toString(findPeakGrid(arr)));
	}
public static int[] findPeakGrid(int[][] mat) {
	int n=mat.length;
	int m=mat[0].length;
	int low=0;
	int high=m-1;
	int[] result=new int[2];
	while(low<=high) {
		int mid=low+(high-low)/2;
		int maxrowindex=findmaxrowindex(mat,n,m,mid);
		int left=(mid-1>=0)?mat[maxrowindex][mid-1]:-1;
		int right=(mid+1<m)?mat[maxrowindex][mid+1]:-1;
		if(mat[maxrowindex][mid]>left && mat[maxrowindex][mid]>right)
			{
			result[0]=maxrowindex;
			result[1]=mid;
			return result;
			}
		else if(mat[maxrowindex][mid]<left)
			high=mid-1;
		else 
			low=mid+1;
			}
	return result;
}
public static int findmaxrowindex(int mat[][], int n, int m, int mid) {
	int max=-1;
	int index=-1;
	for(int i=0;i<n;i++) {
		if(max<mat[i][mid]) {
			max=mat[i][mid];
			index=i;
		}
			}
	return index;

}
}