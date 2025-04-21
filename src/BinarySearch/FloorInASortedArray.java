package BinarySearch;

public class FloorInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long nums[]= {1,2,8,10,11,12,19};
int n = 7, x = 5;
System.out.println(findFloor(nums, n, x));
	}
	static int findFloor(long arr[], int n, long x) {
		int l=0;
		int h=n-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]<=x)
					l=mid+1;
			else if(arr[mid]>x)
				h=mid-1;
		}
		return h;
	}
}
