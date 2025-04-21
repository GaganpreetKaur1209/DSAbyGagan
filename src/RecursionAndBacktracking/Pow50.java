package RecursionAndBacktracking;

public class Pow50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.00000;
		long n = 10;
		System.out.println(myPow(x,n));
	}
	public static double myPow(double x, long n) {
		 long m=n;
	       if(n==0)
				return 1;
	        n=Math.abs(n);
			double pow=myPow(x,n/2);
			if(m>0 && m%2==0) return pow*pow;
			else if(m>0 && m%2==1) return pow*pow*x;
			else if(m<0 && m%2==0) return 1/(pow*pow);
			else return 1/(pow*pow*x);
	}
}
