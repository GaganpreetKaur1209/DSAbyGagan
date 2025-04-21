package StreakChallenge;

public class TakeGiftsFromtheRichestPile2558 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gifts = {25,64,9,4,100};
		int k = 4;
		System.out.println(pickGifts(gifts,k));
	}
public static long pickGifts(int[] gifts, int k) {
        long sum=0;
        while(k>0) {
        	int max=0;
        	int index=-1;
        for(int i=0;i<gifts.length;i++) {
        	if(max<gifts[i]) {
        		index=i;
        		max=gifts[i];
        	}
        }
        gifts[index]=(int)Math.floor(Math.sqrt(max));
        k--;
        }
        for(int i=0;i<gifts.length;i++) {
        	sum+=gifts[i];
        }
        return sum;
    }
}
