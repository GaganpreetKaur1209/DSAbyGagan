package RecursionAndBacktracking;

public class GenerateAllBinaryStringsWithoutConsecutive1sGFGQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		binary(n,"");
	}
	public static void binary(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		binary(n-1,ans+"0");
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='1' )
			binary(n-1,ans+"1");
	}

}
