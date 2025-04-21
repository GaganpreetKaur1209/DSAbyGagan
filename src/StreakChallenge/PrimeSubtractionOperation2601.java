package StreakChallenge;

import java.util.ArrayList;

public class PrimeSubtractionOperation2601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,11,16,13};
		System.out.println(primeSubOperation(nums));
	}
	public static boolean isPrime(int n){
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
 public static boolean primeSubOperation(int[] nums) {
     for(int i=0; i<nums.length; i++){
         int diff;
         if(i==0){
             diff = nums[0];
         }
         else{
             diff = nums[i]-nums[i-1];
         }
         if(diff<=0){
             return false;
         }
         int lasrgestPrime = 0;
         for(int j = diff-1; j>=2; j--){
             if(isPrime(j)){
                 lasrgestPrime =j;
                 break;
             }
         }
         nums[i] = nums[i] - lasrgestPrime;
     }
     return true;
    }
}