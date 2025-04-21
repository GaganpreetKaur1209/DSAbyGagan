package AdvancedMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println(Arrays.toString(AllPrimeFactors(n)));

	}
	public static int[] AllPrimeFactors(int n)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=2;i*i<=n;i++) {
        	if(n%i==0) {
        		list.add(i);
        		while(n%i==0) {
        			n=n/i;
        		}
        	}
        }
        if(n!=1)
    		list.add(n);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	ans[i]=list.get(i);
        }
        return ans;
    }
}
