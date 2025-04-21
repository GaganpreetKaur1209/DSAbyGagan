package StreakChallenge;

public class BitwiseXORofAllPairings2425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,1,3};
		int[] nums2 = {10,2,5,0};
		System.out.println(xorAllNums(nums1,nums2));
	}
	 public static int xorAllNums(int[] nums1, int[] nums2) {
	       int n=nums1.length;
	       int m=nums2.length;
	       int xor1=0;
	       int xor2=0;
	       if(n%2==1){
	        for(int i:nums2){
	            xor2^=i;
	        }
	       }
	       if(m%2==1){
	        for(int i:nums1){
	            xor1^=i;
	        }
	       }
	       return xor1^xor2;
	    }
	}