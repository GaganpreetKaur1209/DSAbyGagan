package RecursionAndBacktracking;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(generateParenthesis(n));
	}
	public static List<String> generateParenthesis(int n) {
		List<String> list=new LinkedList<>();
		if(n==0)
			return list;
        generate(list,n,0,0,"");
        return list;
    }
	public static String generate(List<String> list,int n,int ob,int cb,String ans) {
		if(ob==n && cb==n) {
			list.add(ans);
			return ans;
		}
		if(ob<n)
			generate(list,n,ob+1,cb,ans+"(");
		if(cb<ob)
			generate(list,n,ob,cb+1,ans+")");
		return ans;
	}
}
