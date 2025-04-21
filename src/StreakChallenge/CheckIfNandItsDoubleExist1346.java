package StreakChallenge;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfNandItsDoubleExist1346 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10,2,5,3};
		 System.out.println(checkIfExist(arr));
	}
public static boolean checkIfExist(int[] arr) {
//     HashMap<Integer,Integer> map=new HashMap<>();
//     for(int i:arr) {
//     if(map.containsKey(2*i)||(i%2==0) && map.containsKey(i/2))
//    	 return true;
//     map.put(i,map.getOrDefault(i, 0)+1);
//     }
//     return false;
	
	//OR
	
	 HashSet<Integer> set = new HashSet<>();
     for (int i : arr) {
         if (set.contains(i * 2)) return true;
         if (i % 2 == 0 && set.contains(i / 2)) return true;
         set.add(i);
     }
     return false;
	
    }
}
