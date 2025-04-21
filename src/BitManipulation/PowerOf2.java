package BitManipulation;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println(isPowerOfTwo(n));
	}
public static boolean isPowerOfTwo(int n) {
	if(n<=0)
        return false;
        if((n&(n-1))==0)
        	return true;
        return false;
    }
}
