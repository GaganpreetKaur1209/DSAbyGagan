package RecursionAndBacktracking;

public class CountNumberOfZeroesQues18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(30402,0));
	}
	public static int count(int n, int c) {
		if(n==0)
			return c;
		int no=n%10;
		if(no==0)
			c++;
		return count(n/10,c);
	}
}
