package BinarySearch;

public class Searcha2DMatrix74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=3;
		System.out.println(searchMatrix(arr,target));
	}
public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++) {
        	if(check(matrix[i],target))
        		return true;
        }
        return false;
    }
public static boolean check(int arr[], int target) {
	int low=0;
	int high=arr.length-1;
	if(arr[low]<=target && target<=arr[high]) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
				return true;
			else if(arr[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
	}
	return false;
}
}
