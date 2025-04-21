package RecursionAndBacktracking;

public class DecreasingIncreasingOrderQues5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		incdec(n);
}
	public static void incdec(int n) {
		if(n==0)
			return;
		System.out.println(n);
		incdec(n-1);
		System.out.println(n);
	}

}
