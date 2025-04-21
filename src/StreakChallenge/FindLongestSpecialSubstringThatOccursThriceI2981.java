package StreakChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLongestSpecialSubstringThatOccursThriceI2981 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaa";
		System.out.println(maximumLength(s));
	}
	public static int maximumLength(String s) {
		List<String> list=new ArrayList<>();
		int ans=0;
		for(int i=0;i<s.length();i++) {
			int index=i;
			while(index<s.length() && s.charAt(index)==s.charAt(i)) {
				list.add(s.substring(i,index+1));
				index++;
			}
		}
		Map<String,Integer> map=new HashMap<>();
		for(String i:list) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			String sub=m.getKey();
			int count=m.getValue();
			if(count>=3) {
				ans=Math.max(ans, sub.length());
			}
		}
		return ans==0?-1:ans;
	}
}
