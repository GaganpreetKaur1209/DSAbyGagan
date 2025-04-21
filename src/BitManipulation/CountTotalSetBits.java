package BitManipulation;

public class CountTotalSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		System.out.println(countSetBits(n));
	}
	public static int countSetBits(int n){
	    
        // Your code here
		int count=0;
        for(int i=1;i<=n;i++) {
        	int num=i;
        	while(num>0) {
        	count+=num&1;
        	num=num>>1;
        }
        }
        	return count;
    }
}
