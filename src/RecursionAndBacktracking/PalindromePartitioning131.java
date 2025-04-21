package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		System.out.println(partition(s));
	}
	public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        palindrome(ans, list, s, 0);
        return ans;
    }
    public static void palindrome(List<List<String>> ans, List<String> list, String s, int index){
        if(index==s.length()){
           ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(checkpalindrome(s,index,i)){
            list.add(s.substring(index,i+1));
            palindrome(ans,list, s,i+1);
            list.remove(list.size()-1);
            }
        }
    }
    public static boolean checkpalindrome(String str, int left,int right){
        if(str.length()==1)
        return true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
            return false;
            else {
                left++;
                right--;
            }            
        }
        return true;
    }
}