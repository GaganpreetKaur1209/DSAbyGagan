package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
int arr[]= {10,9,11,6,15,2};
System.out.println(Arrays.toString(bubbleSort(arr)));
}
	public static int[] bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				 swap=true;
				}
			}
			if(swap==false)
				break;
		}
		
		return arr;
	}
}
