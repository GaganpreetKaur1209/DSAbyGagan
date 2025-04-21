package BinarySearch;

public class FindNthRootOfM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=2;
int m=9;
System.out.println(NthRoot(n,m));
	}
	 public static int NthRoot(int n, int m)
	    {
	        // code here
		 int ans=-1;
		 int low=1;
		 int high=m;
		 while(low<=high) {
			 int mid=low+(high-low)/2;
			 if((int)Math.pow(mid, n)==m)
				 return mid;
			 else if((int)Math.pow(mid, n)>m)
				 high=mid-1;
			 else
				 low=mid+1;
		 }
		 return ans;
	    }
}
