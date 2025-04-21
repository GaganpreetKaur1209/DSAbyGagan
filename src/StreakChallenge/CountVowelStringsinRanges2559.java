package StreakChallenge;

import java.util.Arrays;

public class CountVowelStringsinRanges2559 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"a","e","i"};
		int[][] queries = {{0,2},{0,1},{2,2}};
		System.out.println(Arrays.toString(vowelStrings(words,queries)));
	}
	public static int[] vowelStrings(String[] words, int[][] queries) {
		int arr[]=new int[words.length];
		int ans[]=new int[queries.length];
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if((word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u') && (word.charAt(word.length()-1)=='a'||word.charAt(word.length()-1)=='e'||word.charAt(word.length()-1)=='i'||word.charAt(word.length()-1)=='o'||word.charAt(word.length()-1)=='u')) 
				arr[i]++;
			}
			for(int i=1;i<arr.length;i++) {
				arr[i]=arr[i-1]+arr[i];
				
			}
			for(int i=0;i<queries.length;i++) {
				int start=queries[i][0];
				int end=queries[i][1];
				if(start==0)
					ans[i]=arr[end];
				else
				ans[i]=arr[end]-arr[start-1];
			}
			return ans;
	}
}
