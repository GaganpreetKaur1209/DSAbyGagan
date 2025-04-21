package BubbleSort;

import java.util.Arrays;

public class BubbleSortusingRecursion {
	public static void main(String args[]) {
//int arr[]= {10,9,11,6,15,2};
int arr[]= {10,20,20,30,10};
bubbleSort(0,arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+ " ");
}
}
	public static void bubbleSort(int i, int arr[]) {
		if(i>=arr.length) {
			return;
		}
		boolean swap=false;
		swap=sort(swap,1,arr);
		if(swap==false)
			return;
		i++;
		bubbleSort(i,arr);
		
	}
	public static boolean sort(boolean swap, int j, int arr[]) {
		
		while(j<arr.length) {
			if(arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				swap=true;
			}
			j++;
		}
		return swap;
	}
}
