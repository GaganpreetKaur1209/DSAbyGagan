package BinarySearch;

import java.util.Arrays;

public class FindAPeakElementII1901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{41,8,2,48,18},{16,15,9,7,44},{48,35,6,38,28},{3,2,14,15,33},{39,36,13,46,42}};
		System.out.println(Arrays.toString(findPeakGrid(arr)));
	}
public static int[] findPeakGrid(int[][] mat) {
	 int max=0;
     int n=mat.length;
     int result[]=new int[2];
     for(int i=0;i<n;i++) {
     	int j=findpeakElement(mat[i]);
     	if(max<mat[i][j]) {
     		max=mat[i][j];
     		 result[0]=i;
     		 result[1]=j;
     	}
     }
     return result;
 }
public static int findpeakElement(int mat[]){
	int low=0;
	int high=mat.length-1;
	int ans=-1;
	int index=-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(mat[low]<=mat[mid]) {
			if(ans< mat[mid]) {
			index=mid;
			ans=mat[mid];
			}
			low=mid+1;
		}
		else
			high=mid-1;
	}
	return index;
}
}