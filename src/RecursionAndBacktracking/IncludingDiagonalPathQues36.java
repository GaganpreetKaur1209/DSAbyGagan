package RecursionAndBacktracking;

public class IncludingDiagonalPathQues36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		path(3,3,"");
	}
	public static void path(int r,int c,String ans) {
		if(r==1 && c==1) {
			System.out.println(ans);
			return;
		}
		if(r>1)
			path(r-1,c,ans+"H");
		if(r>1 || c>1)
			path(r-1,c-1, ans+"D");
		if(c>1)
			path(r,c-1,ans+"V");
	}

}
