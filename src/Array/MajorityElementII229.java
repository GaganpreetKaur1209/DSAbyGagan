package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementII229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,2,3};
System.out.println(majorityElement(nums));
	}
public static List<Integer> majorityElement(int[] nums) {
	List<Integer> list=new ArrayList<>();
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i:nums)
	{
		if(map.containsKey(i)) {
				map.put(i, map.getOrDefault(i,0)+1);
		}
		else
			map.put(i, 1);
		}
	for(Map.Entry<Integer,Integer> m:map.entrySet()) {
		 if(m.getValue()>nums.length/3) {
			list.add(m.getKey());
		 }
	}
	return list;
	}
}
