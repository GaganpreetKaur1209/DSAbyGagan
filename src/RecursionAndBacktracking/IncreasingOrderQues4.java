package RecursionAndBacktracking;

public class IncreasingOrderQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		increasing(n);
	}
	public static void increasing(int n) {
		if(n==0)
			return;
		increasing(n-1);
		System.out.println(n);
	}

}
