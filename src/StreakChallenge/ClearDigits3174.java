package StreakChallenge;

import java.util.Stack;

public class ClearDigits3174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(clearDigits(s));
	}
	 public static String clearDigits(String s) {
	        Stack<Character> stack=new Stack<>();
	        for(int i=0;i<s.length();i++){
	            if(!Character.isDigit(s.charAt(i)))
	            stack.push(s.charAt(i));
	            else
	            stack.pop();
	        }
	        StringBuilder sb=new StringBuilder();
	        while(!stack.isEmpty())
	        sb.append(stack.pop());
	        return sb.reverse().toString();
	    }
	}