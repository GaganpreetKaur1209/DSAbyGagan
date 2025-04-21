package RecursionAndBacktracking;

public class PermutationsQues30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		permutation(s,"");
	}
	public static void permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char c=s.charAt(0);
		for(int i=0;i<=ans.length();i++){
			String start=ans.substring(0, i);
			String end=ans.substring(i,ans.length());
			permutation(s.substring(1),start+c+end);
		}
	}

}
