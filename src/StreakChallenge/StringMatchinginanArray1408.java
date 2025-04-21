package StreakChallenge;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray1408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"mass","as","hero","superhero"};
		System.out.println(stringMatching(words));
	}
	public static List<String> stringMatching(String[] words) {
		 List<String> list=new ArrayList<>();
	        for(int i=0;i<words.length;i++){
	            for(int j=0;j<words.length;j++){
	                if(words[i].contains(words[j]) && (i!=j) && (!list.contains(words[j])))
	                list.add(words[j]);
	            }
	        }
	        return list;
	    }
	}