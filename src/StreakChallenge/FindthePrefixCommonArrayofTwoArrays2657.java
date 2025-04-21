package StreakChallenge;

import java.util.Arrays;

public class FindthePrefixCommonArrayofTwoArrays2657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,2,4}; 
		int[] B = {3,1,2,4};
		System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));
	}
	public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int C[]=new int[n];
        int count=0;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]%2==0)
            count++;
            freq[B[i]]++;
            if(freq[B[i]]%2==0)
            count++;
            C[i]=count;
        }
        return C;
    }
}