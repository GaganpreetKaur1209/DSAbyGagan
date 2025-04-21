package SelectionSort;

import java.util.Arrays;

public class SelectionSortMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,5,1,2,3};
System.out.println(Arrays.toString(selectionSort(arr)));
	}
	public static int[] selectionSort(int arr[]) {
for(int i=0;i<arr.length;i++) {
	int min_index=i;
	for(int j=i+1;j<arr.length-1;j++) {
		if(arr[min_index]>arr[j]) {
			min_index=j;
		}
	}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
}
return arr;
	}
}
