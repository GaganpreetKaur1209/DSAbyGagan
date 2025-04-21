package BitManipulation;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		System.out.print(oddEven(n));
	}
	 public static String oddEven(int n) {
	        // code here
		 if((n&1)==1)
			 return "odd";
		 return "even";
	    }
}
