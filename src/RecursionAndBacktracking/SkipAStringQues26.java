package RecursionAndBacktracking;

public class SkipAStringQues26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bacapplecad";
		String skip="apple";
		System.out.println(skip(s,"",skip));
	}
	public static String skip(String s, String ans,String skip) {
		int len=skip.length();
		if(s.length()==0)
			return ans;
		char c=s.charAt(0);
		if(c==skip.charAt(0) && s.startsWith("apple"))
			return skip(s.substring(len),ans,skip);
		else
			return skip(s.substring(1),ans+c,skip);
			
	}

}
