package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementII169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,2,1,1,1,2,2};
System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int nums[]) {
	int c=0, number=0;
	for(Integer i:nums) {
		if(c==0)
			number=i;
		if(number==i)
			c++;
		else
			c--;
	}
	return number;
	}
}
