package BinarySearch;

public class KthMissingPositiveNumber1539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,11};
		int k=5;
		System.out.println(findKthPositive(arr, k));
	}
public static int findKthPositive(int[] arr, int k) {
        int[] missing=new int[arr.length];
        for(int i=0;i<missing.length;i++) {
        	missing[i]=arr[i]-(i+1);
        }
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(missing[mid]<k)
        		low=mid+1;
        	else high=mid-1;
        }
        int ans=arr[high]+(k-missing[high]);
        return ans;
    }

}
