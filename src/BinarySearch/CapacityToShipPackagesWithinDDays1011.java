package BinarySearch;

public class CapacityToShipPackagesWithinDDays1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] weight= {1,2,3,4,5,6,7,8,9,10};
int days=5;
System.out.println(shipWithinDays(weight,days));
	}
	 public static int shipWithinDays(int[] weights, int days) {
		 int low=0;
		 int high=0;
		 int ans=-1;
	        for(int i=0;i<weights.length;i++) {
	        	high+=weights[i];
	        	low=Math.max(low, weights[i]);
	        }
	        if(days==1)
	            return high;
	        while(low<=high) {
	        int mid=low+(high-low)/2;
	        if(checkweight(weights, days, mid)) {
	        	ans=mid;
	        	high=mid-1;
	        }
	        else
	             low=mid+1;
	        }
	        return ans;
	    }
	 
	 public static boolean checkweight(int[] weights, int days, int mid) {
		 int weight=0;
		 int c=0;
		 for(int i=0;i<weights.length;i++) {
			 weight+=weights[i];
			 if(weight==mid) {
				 c++;
				 weight=0;
			 }
			 else if(weight>mid) {
				 c++;
				 weight=weights[i];
			 }
			 else
				 continue;
		 }
		 if(weight<mid)
			 c++;
		 if(c<=days)
			 return true;
		 return false;
	 }
}
