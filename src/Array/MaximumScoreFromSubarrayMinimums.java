package Array;

import java.util.ArrayList;
import java.util.List;

public class MaximumScoreFromSubarrayMinimums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list= new ArrayList<Integer>();
list.add(4);
list.add(3);
list.add(1);
list.add(5);
list.add(6);
System.out.println(pairWithMaxSum(list));
	}
	 public static int pairWithMaxSum(List<Integer> arr) {
	        // Your code goes here
		 int ans=0;
		 for(int i=1;i<arr.size();i++) {
			 ans=Math.max(arr.get(i)+arr.get(i-1), ans);
		 }
		 return ans;
	    }

}
