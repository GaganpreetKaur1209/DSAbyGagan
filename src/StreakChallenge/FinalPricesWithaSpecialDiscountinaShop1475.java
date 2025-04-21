package StreakChallenge;

import java.util.Arrays;

public class FinalPricesWithaSpecialDiscountinaShop1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] prices = {8,4,6,2,3};
		 System.out.println(Arrays.toString(finalPrices(prices)));
	}
public static int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length-2;i++) {
        	int j=i+1;
        	while(j>i && j<prices.length) {
        		if(prices[i]>=prices[j]) {
        		prices[i]=prices[i]-prices[j];
        		break;
        	}
        	else
        		j++;
        	}
        }
        return prices;
    }
}
