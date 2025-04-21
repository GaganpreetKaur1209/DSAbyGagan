package StreakChallenge;

public class MinimumAddtoMakeParenthesesValid921Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(((";
		System.out.println(minAddToMakeValid(s));
	}
	 public static int minAddToMakeValid(String s) {
		 int i=0;
	        int open=0;
	        int close=0;
	        while(i<s.length()) {
	        	if(open>0 && s.charAt(i)==')')
	        		open--;
	        	else if(s.charAt(i)==')')
	        		close++;
	        	else
	        		open++;
	        	i++;
	        }
	        return open+close;
	    }
}
