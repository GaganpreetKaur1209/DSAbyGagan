package StreakChallenge;

public class MinimumNumberofChangestoMakeBinaryStringBeautiful2914Day30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1001";
		System.out.println(minChanges(s));
	}
public static int minChanges(String s) {
	if(s.length()%2!=0)
		return -1;
	int c=0;
        for(int i=0;i<s.length();i=i+2) {
        	if(s.charAt(i)!=s.charAt(i+1))
        		c++;
        }
        return c;
    }
}
