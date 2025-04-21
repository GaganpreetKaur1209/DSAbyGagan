package StreakChallenge;

public class StringCompressionIII3163Day29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "abcde";
		System.out.println(compressedString(word));
	}
public static String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int c=1;
        for(int i=1;i<word.length();i++) {
        	if(word.charAt(i)!=word.charAt(i-1)) {
        		sb.append(c+Character.toString(word.charAt(i-1)));
        		c=1;
        	}
        	else{
        		c++;
        		if(c==10) {
        			sb.append((c-1)+Character.toString(word.charAt(i-1)));
        			c=1;
        		}
        	}
        }
    		sb.append(c+Character.toString(word.charAt(word.length()-1)));
        return sb.toString();
    }
}
