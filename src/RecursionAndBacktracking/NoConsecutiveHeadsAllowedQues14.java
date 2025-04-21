package RecursionAndBacktracking;

public class NoConsecutiveHeadsAllowedQues14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		tossed(n," ");
	}
public static void tossed(int n,String ans) {
	if(n==0) {
		System.out.println(ans);
		return;
	}
	tossed(n-1,ans+"T");
	if(ans.charAt(ans.length()-1)!='H')
		tossed(n-1,ans+"H");
	}

}
