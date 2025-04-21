package RecursionAndBacktracking;

public class FibonacciQues10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if(n==1||n==0)
			return n;
		return fib(n-1)+fib(n-2);
	}
}
