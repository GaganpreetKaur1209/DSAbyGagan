package StreakChallenge;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings2696Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABFCACDB";
		System.out.println(minLength(s));
	}
public static int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
        char currchar=s.charAt(i);
        if(st.isEmpty()) {
        	st.push(currchar);
        	continue;
        }
        if(currchar=='B' && st.peek()=='A' || currchar=='D' && st.peek()=='C') {
        	st.pop();
        }
        else
        	st.push(currchar);
        }
        return st.size();
    }
}
