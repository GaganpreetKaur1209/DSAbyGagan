package StreakChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexofaValidSplit2780 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
	System.out.println(minimumIndex(list));
	}
    public static int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        int freq=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                freq=m.getKey();
            }
        }
        int leftcount=0;
       for(int i=0;i<nums.size()-1;i++){
        if(nums.get(i)==freq)
        leftcount++;
        int leftside=i+1;
        int rightside=nums.size()-leftside;
        int rightcount=max-leftcount;
        if(leftcount>leftside/2 && rightcount>rightside/2)
        return i;
       }
       return -1;
    }
}