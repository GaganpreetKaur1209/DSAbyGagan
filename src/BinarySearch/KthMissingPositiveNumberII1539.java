package BinarySearch;

public class KthMissingPositiveNumberII1539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,11};
		int k=5;
		System.out.println(findKthPositive(arr, k));
	}
public static int findKthPositive(int[] arr, int k) {
      
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(arr[mid]-mid-1<k)
        		low=mid+1;
        	else high=mid-1;
        }
        return (low+k);
    }

}
