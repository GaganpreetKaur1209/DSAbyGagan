package QuickSort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,2,5,7,9,1,2};
		int n=arr.length;
		int low=0;
		int high=n-1;
		quicksort(arr,low,high);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		}
	public static void quicksort(int[] arr, int low, int high) {
		if(low<high) {
		int pivot=partition(arr,low,high);
		
		quicksort(arr, low, pivot-1);
		quicksort(arr, pivot+1, high);
		}
	}
	public static int partition(int arr[], int low, int high) {
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j) {
		while(arr[i]<=pivot) {
			i++;
		}
		while(arr[j]>pivot) {
			j--;
		}
		if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		int temp=arr[j];;
		arr[j]=pivot;
		arr[low]=temp;
		return j;
	}

}
