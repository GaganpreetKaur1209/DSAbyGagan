package Array;

public class BestTimetoBuyandSellStock121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int nums[]= {7,1,5,3,6,4};
	//	int nums[]= {7,6,4,3,1};
		//int nums[]= {1,4,2};
		int nums[]= {3,2,6,5,0,3};
		
System.out.println(maxProfit(nums));
	}
public static int maxProfit(int[] prices) {
	  if(prices.length<2)
	        return 0;
	    int minsofar=prices[0];
	    int maxprofit=0;
	    for(int i=0;i<prices.length;i++) {
	    	minsofar=Math.min(minsofar, prices[i]);
	    	int profit=prices[i]-minsofar;
	    	maxprofit=Math.max(maxprofit, profit);
	    }
	    return maxprofit;
	    
}

}
