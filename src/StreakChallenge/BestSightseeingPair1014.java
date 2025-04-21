package StreakChallenge;

public class BestSightseeingPair1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {8,1,5,2,6};
		System.out.println(maxScoreSightseeingPair(values));
	}
	 public static int maxScoreSightseeingPair(int[] values) {
	        int m=values[0];
	        int ans=Integer.MIN_VALUE;
	        for(int i=1;i<values.length;i++) {
	        	if(m+values[i]-i>ans) 
	        		ans=m+values[i]-i;
	        	if(values[i]+i>m) 
	        		m=values[i]+i;
	        }
	        return ans;
	    }
}
