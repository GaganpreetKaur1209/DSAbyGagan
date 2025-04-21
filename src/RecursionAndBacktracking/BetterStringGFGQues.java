package RecursionAndBacktracking;

import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BetterStringGFGQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "gfg";
		String str2 = "ggg";
		System.out.println(betterString(str1,str2));
	}
	public static String betterString(String str1, String str2) {
		 if(str1.length()==0)
	        	return str1;
	        if(str2.length()==0)
	        	return str2;
	        if(str1.length()==1)
	        	return str1;
	        if(str2.length()==1)
	        	return str2;
	        	HashSet<String> list1=new HashSet<>();
	        int count1=subsequencestr(str1,"",list1);
	        if(count1==Math.pow(2,str1.length())-1) return str1;
	        HashSet<String> list2=new HashSet<>();
	        int count2=subsequencestr(str2,"",list2);
	        return count1>=count2?str1:str2;
	        
	    }
		public static int subsequencestr(String str,String ans,HashSet<String> list) {
			if(str.length()==0) {
			    if(ans.isEmpty())
			    return 0;
				if(!list.contains(ans)) {
					list.add(ans);
				    return 1;
			}
				else
				return 0;
			}
			char c=str.charAt(0);
			int count1=subsequencestr(str.substring(1),ans, list);
			int count2=subsequencestr(str.substring(1),ans+c,list);
			return count1+count2;
		}
}
