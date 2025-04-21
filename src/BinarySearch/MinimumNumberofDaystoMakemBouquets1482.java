package BinarySearch;

public class MinimumNumberofDaystoMakemBouquets1482 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bloomDay = {1,10,3,10,2};
		int m = 3;
		int k = 1;
		System.out.println(minDays(bloomDay,m,k));
	}
	 public static int minDays(int[] bloomDay, int m, int k) {
		 long totalflowers=m*k;
		 if(totalflowers>bloomDay.length)
			 return -1;
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
	        for(int i=0;i<=bloomDay.length-1;i++) {
	        	max=Math.max(max, bloomDay[i]);
	        	min=Math.min(min, bloomDay[i]);
	        }
	        int low=1;
	        int high=max;
	        int ans=0;
	        while(low<=high) {
	        	int mid=low+(high-low)/2;
	        	if(check(bloomDay,m,k,mid)) {
	        		ans=mid;
	        		high=mid-1;
	        	}
	        	else
	        	    low=mid+1;
	        }
	        return ans;
	    }
public static boolean check(int[] bloomDay, int m, int k, int mid) {
	int count=0;
	int bouquets=0;
	for(int i=0;i<=bloomDay.length-1;i++) {
		if(bloomDay[i]<=mid)
			count++;
		else {
			bouquets+=count/k;
			count=0;
		}
	}
	bouquets+=count/k;
	return bouquets>=m;
}
}
