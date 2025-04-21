package BinarySearch;

import java.util.Arrays;

public class CeilTheFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,6,8,9,6,5,5,6};
int x=7;
System.out.println(Arrays.toString(getFloorAndCeil(x,arr)));
	}
	public static int[] getFloorAndCeil(int x, int[] arr) {
        // code here/
		Arrays.sort(arr);
		int[] result=new int[2];
		result[0]=floor(x,arr);
		result[1]=ceil(x,arr);
		return result;
    }
	
	public static int floor(int x, int arr[]) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]<=x) {
				ans=arr[mid];
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
	
	public static int ceil(int x, int arr[]) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=x) {
				ans=arr[mid];
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
}

