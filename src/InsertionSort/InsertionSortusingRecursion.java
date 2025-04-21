package InsertionSort;

import java.util.Arrays;

public class InsertionSortusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,5,1,2,3};
insertionSort(0,arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+ " ");
}
	}
public static void insertionSort(int i,int arr[]) {
	boolean swap=false;
	if(i>=arr.length-1)
		return;
	sort(i+1, arr, swap);
	i++;
	insertionSort(i,arr);
}
public static void sort(int j, int arr[], boolean swap) {
	while(j>0) {
		if(arr[j-1]>arr[j]) {
			int temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
			swap=true;
		}
		j--;
		if(swap==false)
			return;
		
	}
	
}
}
