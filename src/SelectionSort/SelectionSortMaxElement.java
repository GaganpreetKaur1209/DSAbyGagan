package SelectionSort;

import java.util.Arrays;

public class SelectionSortMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,5,1,2,3};
System.out.println(Arrays.toString(selectionSort(arr)));
	}
	public static int[] selectionSort(int arr[]) {
for(int i=0;i<arr.length;i++) {
	int max_index=0;
	for(int j=0;j<arr.length-1;j++) {
		if(arr[max_index]<arr[j]) {
			max_index=j;
		}
	}
		
		int temp=arr[max_index];
		arr[max_index]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	
}
	
return arr;
	}
}
