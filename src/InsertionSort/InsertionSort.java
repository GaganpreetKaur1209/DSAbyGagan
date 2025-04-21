package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,5,1,2,3};
System.out.println(Arrays.toString(insertionSort(arr)));
	}
public static int[] insertionSort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j>0;j--) {
			if(arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			
		}
			else
				break;
	}
	}
	return arr;
}
}
