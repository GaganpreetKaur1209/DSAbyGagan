package Strings;

public class SeparateBlackandWhiteBalls2938Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100";
		System.out.println(minimumSteps(s));
	}
public static long minimumSteps(String s) {

long swap=0;
long black=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='0')
		swap+=black;
	else
		black++;
}
	return swap;

    		      }
}
