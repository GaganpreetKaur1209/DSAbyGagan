package StreakChallenge;

public class StringCompressionIII3163IIDay29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "abcde";
		System.out.println(compressedString(word));
	}
public static String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word.length())
        {
        int c=0;
        char currchar=word.charAt(i);
        while(i<word.length() && c<9 && currchar==word.charAt(i)) {
        	i++;
        	c++;
        }
        	
        sb.append(c).append(currchar);
        }
        return sb.toString();
    }
}
