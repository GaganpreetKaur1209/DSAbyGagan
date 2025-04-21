package RecursionAndBacktracking;

public class SkipACharacterQues25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baccad";
		System.out.println(skip(s,""));
	}
	public static String skip(String s, String ans) {
		if(s.length()==0)
			return ans;
		char c=s.charAt(0);
		if(c!='a')
			return skip(s.substring(1),ans+c);
		else
			return skip(s.substring(1),ans);	
	}

}
