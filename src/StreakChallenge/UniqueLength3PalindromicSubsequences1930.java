package StreakChallenge;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength3PalindromicSubsequences1930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabca";
		System.out.println(countPalindromicSubsequence(s));
	}
public static int countPalindromicSubsequence(String s) {
	       Set<String> set=new HashSet<>();
	       int startIndex[]=new int[26];
	       int endIndex[]=new int[26];
	       for(int i=0;i<26;i++) {
	    	   startIndex[i]=-1;
	    	   endIndex[i]=-1;
	       }
	       for(int i=0;i<s.length();i++) {
	    	   if(startIndex[s.charAt(i)-'a']==-1) 
	    		   startIndex[s.charAt(i)-'a']=i;
	    	   endIndex[s.charAt(i)-'a']=i;
	       }
	       for(int i=0;i<26;i++) {
	    	   if(endIndex[i]-startIndex[i]>=2) {
	    		   for(int j=startIndex[i]+1;j<endIndex[i];j++) {
	    		   set.add((char)(i+'a')+""+s.charAt(j)+""+(char)(i+'a'));
	    	   }
	    	   }
	       }
	       System.out.println(set);
	       return set.size();
	    }
	}