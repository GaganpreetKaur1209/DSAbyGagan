package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class IncludingDiagonalPathUsingListQues37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(path(3,3,""));
	}
	public static List<String> path(int r,int c,String ans) {
		if(r==1 && c==1) {
			List<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		List<String> res=new ArrayList<>();
		if(r>1)
			res.addAll(path(r-1,c,ans+"H"));
		if(r>1 || c>1)
			res.addAll(path(r-1,c-1, ans+"D"));
		if(c>1)
			res.addAll(path(r,c-1,ans+"V"));
	return res;
	}
}
