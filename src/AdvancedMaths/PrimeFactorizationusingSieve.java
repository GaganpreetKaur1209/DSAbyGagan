package AdvancedMaths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationusingSieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12246;
		List<Integer> list=findPrimeFactors(n);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
	public static List<Integer> findPrimeFactors(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=2;i*i<=n;i++) {
        	if(n%i==0) {
        		while(n%i==0) {
        			list.add(i);
        			n=n/i;
        		}
        	}
        }
        if(n!=1)
        	list.add(n);
        return list;
    }
}
