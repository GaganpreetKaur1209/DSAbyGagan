package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {2,7,11,15};
//int target = 9;
int arr[]= {3,2,4};
int target =6;

System.out.println(Arrays.toString(twoSum(arr,target)));
	}
	 public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(map.containsKey(target-nums[i])) {
	        		 int arr[]=new int[2];
	        		arr[0]=map.get(target-nums[i]);
	        		arr[1]=i;
	        		return arr;
	        	}
	        	else
	        		map.put(nums[i], i);
	        }
	        return new int[] {0,1};
	    }
}
