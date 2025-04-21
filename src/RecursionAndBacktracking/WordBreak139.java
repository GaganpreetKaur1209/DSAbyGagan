package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak(s, wordDict));
	}
	public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        return solve(0, 0, s, set);
    }
    public static boolean solve(int start, int end, String s, HashSet<String> wd){
        if(end==s.length()-1){
            if(wd.contains(s.substring(start, end+1)))
            return true;
            else
            return false;
        }
        if(wd.contains(s.substring(start, end+1))){
            if(solve(end+1, end+1, s,wd))
            return true;
        }
        return solve(start, end+1, s, wd);
    }
}