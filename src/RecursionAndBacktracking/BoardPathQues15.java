package RecursionAndBacktracking;

public class BoardPathQues15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board(0,"");
	}
	public static void board(int sum, String ans) {
		if(sum==4) {
			System.out.println(ans);
			return;
		}
		if(sum>4)
			return;
		board(sum+1,ans+"1");
		board(sum+2,ans+"2");
		board(sum+3,ans+"3");
	}

}
