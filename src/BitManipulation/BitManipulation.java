package BitManipulation;

public class BitManipulation {
	public static void main(String args[]) {
		int no=678883006;       //8;       //70;
		int bit=16;             //1;       //3;
		bitManipulation(no,bit);
	}
	 public static void bitManipulation(int num, int i) {
	        int getbit=(num>>i-1)&1;
	        int setbit=num|(1<<i-1);
	        int clearbit=num&~(1<<i-1);
	        System.out.print(getbit+" "+setbit+" "+clearbit);
	    }
}
