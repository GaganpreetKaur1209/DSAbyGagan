package BinarySearch;

public class Rowwithmax1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{0, 1, 1, 1},
		                  {0, 0, 1, 1},
		                  {1, 1, 1, 1},
		                  {0, 0, 0, 0}};
		System.out.println(rowWithMax1s(arr));
	}
	 public static int rowWithMax1s(int arr[][]) {
		 int count=0;
		 int result=-1;
	        for(int i=0;i<arr.length;i++) {
	        	int first=checkfirst(arr[i]);
	        	if(first==-1)
	        		continue;
	        	int last=checklast(arr[i]);
	        	if(count<(last-first+1)) {
	        		result=i;
	        		count=last-first+1;
	        }
	        }
	        return result;
	    }
	 public static int checkfirst(int[] arr) {
		 int low=0;
		 int high=arr.length-1;
		 int ans=-1;
		 while(low<=high) {
			 int mid=low+(high-low)/2;
			 if(arr[mid]>=1) {
				 ans=mid;
				 high=mid-1;
			 }
			 else
				 low=mid+1;
		 }
		 return ans;
	 }
	 public static int checklast(int[] arr) {
		 int low=0;
		 int high=arr.length-1;
		 int ans=-1;
		 while(low<=high) {
			 int mid=low+(high-low)/2;
			 if(arr[mid]<=1) {
				 ans=mid;
				 low=mid+1;
			 }
			 else
				 high=mid-1;
		 }
		 return ans;
	 }
}
