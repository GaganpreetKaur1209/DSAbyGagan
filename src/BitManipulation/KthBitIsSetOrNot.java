package BitManipulation;

public class KthBitIsSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=0;
		System.out.print(checkKthBit(n,k));
	}
	 public static boolean checkKthBit(int n, int k) {
	        // Your code here
		 if(((n>>k)&1)==1)
			 return true;
		 return false;
	    }
}
