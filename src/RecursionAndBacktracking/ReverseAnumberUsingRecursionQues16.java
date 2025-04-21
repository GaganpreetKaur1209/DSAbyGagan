package RecursionAndBacktracking;

public class ReverseAnumberUsingRecursionQues16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		System.out.println(reverse(n,0));
	}
	public static int reverse(int n, int sum) {
		if(n==0)
			return sum;
		int rem=n%10;
		return reverse(n/10,sum*10+rem);
	}

}
