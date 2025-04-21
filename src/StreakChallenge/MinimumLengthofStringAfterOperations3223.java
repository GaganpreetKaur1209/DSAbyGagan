package StreakChallenge;

public class MinimumLengthofStringAfterOperations3223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaacbcbb";
		System.out.println(minimumLength(s));
	}
	 public static int minimumLength(String s) {
	        int arr[]=new int[26];
	       // for(char c:s.toCharArray()){
	        for(int i=0;i<s.length();i++){
	            arr[s.charAt(i)-'a']++;
	        }
	        for(int i=0;i<26;i++){
	            while(arr[i]>=3){
	                arr[i]-=2;
	            }
	        }
	        int count=0;
	         for(int i=0;i<26;i++){
	            count+=arr[i];
	         }
	         return count;
	    }
	}