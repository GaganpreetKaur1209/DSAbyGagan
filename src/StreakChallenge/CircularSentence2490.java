package StreakChallenge;

public class CircularSentence2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "leetcode exercises sound delightful";
		System.out.println(isCircularSentence(sentence));

	}
public static boolean isCircularSentence(String sentence) {
       String[] str=sentence.split(" ");
       for(int i=0;i<str.length-1;i++) {
    	   int n=str[i].length()-1;
    	   String word=str[i];
    	   if(word.charAt(n)!=str[i+1].charAt(0))
    		   return false;
       }
       if(str[str.length-1].charAt(str[str.length-1].length()-1)!=str[0].charAt(0))
    	   return false;
       return true;
    }
}
