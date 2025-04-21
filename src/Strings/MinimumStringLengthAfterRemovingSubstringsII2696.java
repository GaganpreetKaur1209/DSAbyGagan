package Strings;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstringsII2696 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABFCACDB";
		System.out.println(minLength(s));
	}
public static int minLength(String s) {
        char arr[]=s.toCharArray();
        int count=0;
        int i=0;
        while(i<s.length()) {
        	arr[count]=arr[i];
        	if(count>0 && (arr[count-1]=='A' && arr[i]=='B'||arr[count-1]=='C' && arr[i]=='D')) 
        		count--;
        	else 
        		count++;
        	i++;
        }
        return count;
    }
}
