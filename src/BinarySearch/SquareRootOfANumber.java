package BinarySearch;

public class SquareRootOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=5;
		System.out.println(floorSqrt(n));
	}
	public static long floorSqrt(long n) {
        // Your code here
		long low=0;
		long high=n;
		long ans=0;
		while(low<=high) {
			long mid=low+(high-low)/2;
			if(mid*mid<=n) {
				ans=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return ans;
    }
}
