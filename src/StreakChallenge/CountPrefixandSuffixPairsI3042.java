package StreakChallenge;

public class CountPrefixandSuffixPairsI3042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"a","aba","ababa","aa"};
		System.out.println(countPrefixSuffixPairs(words));
	}
	 public static int countPrefixSuffixPairs(String[] words) {
	        int count=0;
	        for(int i=0;i<words.length-1;i++) {
	        	int n=words[i].length();
	        	for(int j=i+1;j<words.length;j++) {
	        		int m=words[j].length();
	        		if(n<=m) {
//	        		if(words[i].equals(words[j].substring(0, n)) && (words[i].equals(words[j].substring(m-n, m))))
//	        			count++;
	        			if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
	        				count++;
	        		}
	        	}
	        }
	        return count;
	    }
}
