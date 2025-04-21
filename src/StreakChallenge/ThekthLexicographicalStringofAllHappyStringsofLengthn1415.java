package StreakChallenge;

import java.util.ArrayList;
import java.util.List;

public class ThekthLexicographicalStringofAllHappyStringsofLengthn1415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int k = 9;
		System.out.println(getHappyString(n,k));

	}
	public static String getHappyString(int n, int k) {
	       List<String> list = new ArrayList<>();
	       lexicographical(list,n,"");
	       return list.size()<k?"":list.get(k-1);
	    }
	    public static void lexicographical(List<String> list, int n,String ans){
	        if(n==0){
	            list.add(ans);
	            return;
	        }        
	        if(n>0 && (ans.isEmpty() || ans.charAt(ans.length()-1)!='a'))
	        lexicographical(list,n-1,ans+"a");
	         if(n>0 && (ans.isEmpty() || ans.charAt(ans.length()-1)!='b'))
	       lexicographical(list,n-1,ans+"b");
	         if(n>0 && (ans.isEmpty() || ans.charAt(ans.length()-1)!='c'))
	       lexicographical(list,n-1,ans+"c");
	    }
	}