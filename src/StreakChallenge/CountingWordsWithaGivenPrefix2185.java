package StreakChallenge;

public class CountingWordsWithaGivenPrefix2185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] words = {"pay","attention","practice","attend"};
		 String pref = "at";
		 System.out.println(prefixCount(words,pref));
	}
	 public static int prefixCount(String[] words, String pref) {
//		  int c=0;
//	        for(int i=0;i<words.length;i++){
//	            if(words[i].startsWith(pref))
//	            c++;
//	        }
//	        return c; 
		 int c=0;
		 int n=pref.length();
		 for(int i=0;i<words.length;i++) {
			 if(n>=words[i].length()) {
				 if(pref.equals(words[i].substring(0, n)))
					 c++;
			 }
		 }
		 return c;
	 }
}
