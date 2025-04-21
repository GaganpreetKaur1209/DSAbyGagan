package BinarySearch;

public class KokoEatingBananas875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles,h));
	}
public static int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=piles.length-1;i++) {
        	if(max<piles[i])
        		max=piles[i];
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	int totaltime=0;
        	for(int i=0;i<=piles.length-1;i++) {
        	totaltime+=Math.ceil((double)piles[i]/(double)mid);
        	}
        	if(totaltime<=h) {
        		ans=mid;
        		high=mid-1;
        	}
        	else
        		low=mid+1;
        }
        	
        	return ans;
    }
}
