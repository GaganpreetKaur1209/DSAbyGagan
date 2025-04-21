package RecursionAndBacktracking;

public class PalindromeQues17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234321;
		int rev=reverse(n,0);
		System.out.println(check(rev,n));
	}
	public static int reverse(int n, int sum) {
		if(n==0)
			return sum;
		int rem=n%10;
		return reverse(n/10,sum*10+rem);
	}
	public static boolean check(int rev, int n) {
		return (rev==n);
	}

}
