package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationUsingListQues31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(permutation(s,""));
	}
	public static List<String> permutation(String s, String ans){
		if(s.length()==0) {
			List<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		List<String> res=new ArrayList<>();
		char c=s.charAt(0);
		for(int i=0;i<=ans.length();i++) {
			String start=ans.substring(0, i);
			String end=ans.substring(i,ans.length());
			res.addAll(permutation(s.substring(1),start+c+end));
		}
		return res;
	}

}
