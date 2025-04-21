package StreakChallenge;

import java.util.Arrays;

public class DefuseTheBomb1652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = {2,4,9,3};
		int  k = -2;
		int ans[]=decrypt(code,k);
		System.out.println(Arrays.toString(ans));
	}
	 public static int[] decrypt(int[] code, int k) {
		 int n=code.length;
	        int ans[]=new int[n];
	        if(k==0) 
	        return ans;
	        
	        else if(k>0) {
	        	for(int i=0;i<n;i++) {
	        		int c=1;
	        		int j=i;
	        		while(c<=k) {
	        			ans[i]+=code[(++j)%n];
	        		c++;
	        	}
	        	}
	        }
	        else {
	        	for(int i=0;i<n;i++) {
	        		int c=k;
	        		int j=i;
	        		while(c<0) {
	        			ans[i]+=code[(n+(--j))%n];
	        		c++;
	        	}
	        	}
	        }
	        return ans;
	 }
}
