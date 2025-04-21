package RecursionAndBacktracking;

import java.util.ArrayList;

public class RatinaMazeProblemIGFGUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        // Adding rows to the 2D ArrayList
        mat.add(new ArrayList<Integer>() {{ add(1); add(0); add(0); add(0); }});
        mat.add(new ArrayList<Integer>() {{ add(1); add(1); add(0); add(1); }});
        mat.add(new ArrayList<Integer>() {{ add(1); add(1); add(0); add(0); }});
        mat.add(new ArrayList<Integer>() {{ add(0); add(1); add(1); add(1); }});
		System.out.println(findPath(mat));
	}
	  public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
	        // code here
		  ArrayList<String> list=new ArrayList<>();
		  path(list,0,0,"",mat);
		  return list;
	    }
		private static void path(ArrayList<String> list, int i, int j, String string, ArrayList<ArrayList<Integer>> mat) {
			if(i==mat.size()-1 && j==mat.size()-1) {
				list.add(string);
				return;
			}
			if(i<0 || i>=mat.size() || j<0|| j>=mat.size() ||mat.get(i).get(j)==0)
				return;
			mat.get(i).set(j, 0);
			path(list, i+1, j, string+"D", mat);
			path(list, i, j-1, string+"L", mat);
			path(list, i, j+1, string+"R", mat);
			path(list, i-1, j, string+"U", mat);
			mat.get(i).set(j, 1);
		}
		  
	}