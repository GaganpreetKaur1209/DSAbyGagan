package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintASCIIValueofaCharacterQues29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		System.out.println(subsequence(s,""));
	}
	public static List<String> subsequence(String s,String ans){
		if(s.length()==0) {
			List<String> list=new ArrayList<>();
			list.add(ans);
			return list;
	}
		char c=s.charAt(0);
		List<String> left=subsequence(s.substring(1),ans);
		List<String> right=subsequence(s.substring(1),ans+c);
		List<String> ascii=subsequence(s.substring(1),ans+(c+0));
		left.addAll(right);
		left.addAll(ascii);
		return left;
}
}
