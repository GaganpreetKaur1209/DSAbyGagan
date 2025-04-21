package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,12,24,29,39,40,51,56,69};
int target=56;
System.out.println(search(arr,target));
	}
	public static int search(int arr[], int target) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				high=mid-1;
			else if(arr[mid]<target)
				low=mid+1;
		}
		return -1;
	}

}
