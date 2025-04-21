package BitManipulation;

public class SetTheRightmostUnsetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(setBit(n));
	}
	public static int setBit(int n) {
        // code here
		int ans=n|(n+1);
		return ans;
    }
}
