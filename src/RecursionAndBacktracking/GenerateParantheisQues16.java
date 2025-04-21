package RecursionAndBacktracking;

public class GenerateParantheisQues16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		brackets(n,0,0,"");
	}
	public static void brackets(int n, int ob, int cb,String ans) {
		if(ob==n && cb==n) {
			System.out.println(ans);
			return;
		}
		if(ob<n) 
			brackets(n,ob+1, cb, ans+"(");
		if(ob>cb)
			brackets(n,ob,cb+1,ans+")");
	}

}
