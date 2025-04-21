package MergeSort;
import java.util.*;
import java.util.Arrays;

public class MergeSorting {
public static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
//	System.out.print("Enter array size: ");
//	int n=sc.nextInt();
//	int arr[]=new int[n];
//	for(int i=0;i<n;i++) {
//		arr[i]=sc.nextInt();
//	}
	int arr[]= {11,99,22,88,33,77,44,66,55};
	int start=0;
	int end=arr.length-1;
	merge(arr,start,end);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
}
public static void merge(int arr[], int start, int end) {
	if(start>=end) 
		return;
	int mid=start+(end-start)/2;
	merge(arr, start, mid);
	merge(arr, mid+1, end);
	conquer(arr, start, mid, end);
}
public static void conquer(int arr[], int start, int mid, int end) {
	int i=start;
	int j=mid+1;
	int c=0;
	//int mergeSort[]=new int[arr.length];
	int mergeSort[]=new int[end-start+1];
	while(i<=mid && j<=end) {
		if(arr[i]>arr[j]) {
			mergeSort[c]=arr[j];
			j++;
			c++;
		}
		else {
			mergeSort[c]=arr[i];
			i++;
			c++;
		}
	}
	while(i<=mid) {
		mergeSort[c]=arr[i];
		i++;
		c++;
	}
	while(j<=end) {
		mergeSort[c]=arr[j];
		j++;
		c++;
	}
	for(int len=0,length=start;len<mergeSort.length;len++,length++) {
		arr[length]=mergeSort[len];
	}
	
}
}
