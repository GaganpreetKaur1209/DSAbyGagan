package BitManipulation;

public class FindXORofNumbersFromLToR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L=4;
		int R=8;
		System.out.println(findXOR(L,R));
	}
	 public static int findXOR(int l, int r) {
		 return xor(l-1)^xor(r);
	 }
	 public static int xor(int n) {
		 if(n%4==1)
			 return 1;
		 else if(n%4==2)
			 return n+1;
		 else if(n%4==3)
			 return 0;
		 else
			 return n;
	 }
}
