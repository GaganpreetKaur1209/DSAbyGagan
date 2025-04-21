package BinarySearch;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,4,7,10,9};
		int cows=4;
		System.out.println(aggressivecows(arr,cows));
	}
	public static int aggressivecows(int arr[], int cows) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		} 
		int ans=0;
		int low=1;
		int high=max-min;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(canweplace(arr,mid,cows)) {
				ans=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return ans;
	}
	
	public static boolean canweplace(int[] arr, int mid, int cows) {
		int count=1;
		int lastcow=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-lastcow>=mid) {
				count++;
				lastcow=arr[i];
			}
		}
		if(count>=cows)
			return true;
		return false;
	}
}
