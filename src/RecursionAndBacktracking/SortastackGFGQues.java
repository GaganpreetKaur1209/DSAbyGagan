package RecursionAndBacktracking;

import java.util.Stack;

public class SortastackGFGQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.add(11);
		s.add(2);
		s.add(32);
		s.add(3);
		s.add(41);
		System.out.println(sort(s));
	}		
	 public static Stack<Integer> sort(Stack<Integer> s) {
	       if(s.isEmpty()||s.size()==1)
	    	   return s;
	       int value=s.pop();
	       sort(s);
	       insert(value,s);
	       return s;
	    }
	 public static void insert(int value, Stack<Integer> s) {
		 if(s.isEmpty()||s.peek()<=value) {
			 s.push(value);
			 return;
		 }
		 int top=s.pop();
		 insert(value,s);
		 s.push(top);
	 }
	 
}
