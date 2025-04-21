package StreakChallenge;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class ShortestSubarraytobeRemovedtoMakeArraySorted1574 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		System.out.println(findLengthOfShortestSubarray(arr));
	}
	 public static int findLengthOfShortestSubarray(int[] arr) {
		 Stack<Integer> stack=new Stack<>();
		 int c=0;
		 if(arr[0]<arr[1])
			 stack.push(arr[0]);
		 else c++;
		 int i=1;
	        while(i<arr.length-1) {
	        if(arr[i-1]<arr[i] && arr[i]<arr[i+1]||stack.peek()<arr[i])
	        	stack.push(arr[i]);
	        else
	        	c++;
	        i++;
	        }
	        
	        			return c;
    }
}