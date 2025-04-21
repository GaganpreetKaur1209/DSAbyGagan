package StreakChallenge;

public class MakeStringaSubsequenceUsingCyclicIncrements2825 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "ad";
		System.out.println(canMakeSubsequence(str1,str2));

	}
public static boolean canMakeSubsequence(String str1, String str2) {
	 int i=0;
     for (char c : str1.toCharArray()) {
         if (i < str2.length() && (str1.charAt(i) - c + 26) % 26 <= 1) {
             i++;
         }
     }
     return i == str2.length();
    }
}
