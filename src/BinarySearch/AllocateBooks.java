package BinarySearch;

public class AllocateBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pages[]= {25,46,28,49,24};
		int n=5;
		int m=4;
		System.out.println(findPages(pages, n,m));
	}
	public static int findPages(int[] arr, int n, int m) {
        // Write your code here.
		if(n<m)
			return -1;
		else if(n==m) {
			int min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				min=Math.min(min, arr[i]);
		}
			return min;
		}
		int low=0;
		int high=0;
		for(int i=0;i<arr.length;i++) {
			low=Math.max(low, arr[i]);
			high+=arr[i];
		}
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(noOfStudents(arr,mid)==m)
				{
				return mid;
				}
			else if(noOfStudents(arr,mid)<m)
				high=mid-1;
			else
				low=mid+1;	
		}
		return -1;
    }
	public static int noOfStudents(int arr[], int mid) {
		int pages=0;
		int student=1;
		for(int i=0;i<arr.length;i++) {
		if(pages+arr[i]<=mid)
			pages+=arr[i];
		else {
			student++;
			pages=arr[i];
		}
	}
return student;
}
}
