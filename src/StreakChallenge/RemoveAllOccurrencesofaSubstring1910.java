package StreakChallenge;

public class RemoveAllOccurrencesofaSubstring1910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "axxxxyyyyb";
		String part = "xy";
		System.out.println(removeOccurrences(s,part));
	}
	public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
       while(s.contains(part)) {
    	   s=s.replaceAll(part, "");
       }
       return s;
	}
}
