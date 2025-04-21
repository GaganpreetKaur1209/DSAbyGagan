package AdvancedMaths;

public class PowerExponential50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x=2.00000;
		int n=10;
		System.out.println(myPow(x,n));
	}
public static double myPow(double x, int n) {
	int m=n;
	n=Math.abs(n);
	double ans=1;
        while(n>0) {
        	if(n%2==1) {
        		ans=ans*x;
        		n=n-1;
        	}
        	else {
        		x=x*x;
        		n=n/2;
        	}
        }
        if(m<0)
        	return 1/ans;
        return ans;
    }
}
