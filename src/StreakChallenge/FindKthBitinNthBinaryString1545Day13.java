package StreakChallenge;

import java.util.Arrays;

public class FindKthBitinNthBinaryString1545Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int k = 5;
		System.out.println(findKthBit(n,k));
	}
public static char findKthBit(int n, int k) {
        String[] str=new String[n];
        str[0]="0";
        for(int i=1;i<n;i++) {
        	str[i]=formString(str[i-1]);
        	System.out.println(Arrays.toString(str));
        }
        return str[n-1].charAt(k-1);
    }
public static String formString(String str) {
	String formedstr =  str + "1" +reverse(invert(str));
	return formedstr;
}
public static String reverse(String str) {
	StringBuilder sb=new StringBuilder(str);
	return sb.reverse().toString();
}
public static String invert(String str) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='0')
			sb.append('1');
		else
			sb.append('0');
	}
	return sb.toString();
}
}
