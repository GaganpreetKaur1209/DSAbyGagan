package RecursionAndBacktracking;

public class DecreasingQues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		decreasing(n);
	}
	public static void decreasing(int n) {
		if(n==0)
			return;
		System.out.println(n);
		decreasing(n-1);
	}

}
