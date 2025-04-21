package BitManipulation;

public class MinimumBitFlipstoConvertNumber2220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10;
		int goal=7;
		System.out.println(minBitFlips(start, goal));
	}
	 public static int minBitFlips(int start, int goal) {
	        int xor=start^goal;
	        int count=0;
	        while(xor>1) {
	        	count+=xor&1;
	        	xor=xor>>1;
	        }
	        if(xor==1)
	        	count+=1;
	        return count;
	    }
}
