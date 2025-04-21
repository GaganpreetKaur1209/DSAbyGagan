package RecursionAndBacktracking;

public class RotatedBinarySearchQues24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,9,1,2,3};
		System.out.println(rbs(arr,0,arr.length,6));
	}
	public static int rbs(int arr[],int start, int end,int target) {
		if(start>end)
			return -1;
		int mid=start+(end-start)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[start]<arr[mid]) {
			if(target>arr[start] && target<arr[mid])
				rbs(arr,start,mid-1,target);
			else
				rbs(arr,mid+1,end,target);
	}
			if(target>arr[mid] && target<arr[end])
				rbs(arr,mid+1,end,target);
		
			return rbs(arr,start,mid-1,target);
	
		}

}
