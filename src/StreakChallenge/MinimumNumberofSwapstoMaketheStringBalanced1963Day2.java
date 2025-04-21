package StreakChallenge;

public class MinimumNumberofSwapstoMaketheStringBalanced1963Day2 {
public static void main(String args[]) {
	String s = "][][";
	System.out.println(minSwaps(s));
}
public static int minSwaps(String s) {
    int open=1;
    int i=1;
    while(i<s.length()) {
    	if(s.charAt(i)==']' && s.charAt(i-1)=='[')
    		open--;
    	else
    		open++;    		
    	i++;
    }
    return open/2;
}
}
