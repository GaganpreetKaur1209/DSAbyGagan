package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		System.out.println(generate(numRows));
	}
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> list=new  ArrayList<List<Integer>>();
	        for(int i=0;i<numRows;i++) {
	        	List<Integer> list2=new ArrayList<>(i+1);
	        	for(int j=0;j<=i;j++) {
	        		if(j==0) {
	        		list2.add(0, 1);
	        		}
	        		else if(j==i) {
	        		list2.add(j,1);
	        		}
	        		else
	        		list2.add(j,list.get(i-1).get(j-1)+list.get(i-1).get(j));
	        	}
	        	list.add(list2);
	        }
	        	return list;
	    }

}
