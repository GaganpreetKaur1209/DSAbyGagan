package RecursionAndBacktracking;

import java.util.Stack;

public class ReverseaStackGFGQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.add(3);
		s.add(2);
		s.add(1);
		s.add(7);
		s.add(6);
		reverse(s);
		 System.out.println(s);
	}
	public static void reverse(Stack<Integer> s)
	    {
	      if(s.isEmpty())
	    	  return;
	      int temp=s.pop();
	      reverse(s);
	      insertAtBottom(s,temp);
	    }
	public static void insertAtBottom(Stack<Integer> s,int temp) {
		if(s.isEmpty()) {
			s.push(temp);
			return;
		}
		int value=s.pop();
		insertAtBottom(s,temp);
		s.push(value);
	}
}
