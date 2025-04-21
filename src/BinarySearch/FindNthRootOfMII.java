package BinarySearch;

public class FindNthRootOfMII {

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
			 int r=check(mid,n,m);
			 if(r==1)
				 return mid;
			 else if(r==2)
				 high=mid-1;
			 else
				 low=mid+1;
		 }
		 return ans;
	    }
	 public static int check(int mid, int n, int m) {
		 long ans=1;
		 for(int i=1;i<=n;i++) {
			 ans*=mid;
			 if(ans>m)
				 return 2;
		 }
		 if(ans==m)
			 return 1;
	 return 0;
}
}