package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,1,1,1,2,2};
System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int nums[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
	//	int c=0;
		int max=0;
		for(int i=0;i<nums.length;i++) {
		if(map.containsKey(nums[i])) {
			//c=map.get(nums[i]);
			map.put(nums[i],  map.get(nums[i])+1);
		}
		else
			map.put(nums[i], 1);
	}
			int ans=0;
			for(Map.Entry<Integer,Integer> m:map.entrySet()){
				if(m.getValue()>max) {
					max=m.getValue();
					ans=m.getKey();
				}
						
		}
		return ans;
	}
}
