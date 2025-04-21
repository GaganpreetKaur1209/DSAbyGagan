package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LetterCombinationsofaPhoneNumberQues17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digit="23";
		System.out.println(letterCombinations(digit));
	}
	public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        char c[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        List<String> list=combination(digits,c,"");
        return list;
    }
    public static List<String>  combination(String digits,char c[][],String res) {
        if(digits.length()==0){
            List<String> ans=new ArrayList<>();
            ans.add(res);
            return ans;
        }
        List<String> result=new ArrayList<>();
        int ch=digits.charAt(0)-2-'0';
        for(char i:c[ch]){
           result.addAll(combination(digits.substring(1),c,res+i));
        }
        return result;
        }
}