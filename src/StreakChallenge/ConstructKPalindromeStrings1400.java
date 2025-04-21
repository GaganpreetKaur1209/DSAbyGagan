package StreakChallenge;

public class ConstructKPalindromeStrings1400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "annabelle";
		int k = 2;
		System.out.println(canConstruct(s,k));
	}
	public static boolean canConstruct(String s, int k) {
		  if(s.length()<k)
		        return false;
		        int count=0;
		        int arr[]=new int[26];
		        for(int i=0;i<s.length();i++){
		            arr[s.charAt(i)-'a']++;
		        }
		        for(int i:arr){
		            if(i%2!=0)
		            count++;
		        }
		        return count<=k;
	}
}
