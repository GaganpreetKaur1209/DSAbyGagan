package StreakChallenge;

import java.util.Stack;

public class ParsingABooleanExpression1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "&(|(f))";
		System.out.println(parseBoolExpr(expression));
	}
	 public static boolean parseBoolExpr(String expression) {
	        Stack<Character> st=new Stack<>();
	        for(int i=0;i<expression.length();i++) {
	        	char ch=expression.charAt(i);
	        	if(ch=='('||ch==',')
	        		continue;
	        	else if(ch=='t' || ch=='f' || ch=='&' ||ch=='|' || ch=='!')
	        		st.push(ch);
	        	else if(!st.isEmpty() && ch==')') {
	        		boolean isTrue=false;
	        		boolean isFalse=false;
	        		while(st.peek()!='&' && st.peek()!='|' && st.peek()!='!') {
	        			char value=st.pop();
	        			if(value=='t')
	        				isTrue=true;
	        			else if(value=='f')
	        				isFalse=true;
	        		}
	        	char exp=st.pop();
	        	if(exp=='&')
	        		st.push(isFalse==true?'f':'t');
	        	else if(exp=='|')
	        		st.push(isTrue==true?'t':'f');
	        	else if(exp=='!')
	        		st.push(isFalse==true?'t':'f');
	        	}
	        }
	        return st.peek()=='t'?true:false;
	    }
}
