package Array;
public class CheckIfArrayPairsAreDivisiblebyk1497 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int k = 7;
		System.out.println(canArrange(arr,k));
	}
	 public static boolean canArrange(int[] arr, int k) {
		 int remainder[]=new int[k];
		 int count;
	     for(int i=0;i<arr.length;i++) {
	    	 count=arr[i]%k;
	    	 if(count<0) {
	    		 count+=k;
	    	 }
	    	 remainder[count]++;
	     }
	     if(remainder[0]%2!=0)
	    	 return false;
	     for(int i=1;i<=k/2;i++) {
	    	 if(remainder[i]!=remainder[k-i])
	    		 return false;
	     }
	     return true;
	 }
}
