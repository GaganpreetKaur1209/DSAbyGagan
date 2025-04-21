package Array;

import java.util.Stack;

public class MaximumWidthRamp962Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,0,8,2,1,5};
		System.out.println(maxWidthRamp(nums));
	}
public static int maxWidthRamp(int[] nums) {
	    if(nums.length<2)
	    	return 0;
	    int ans=0;
	    Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++) {
        	if(st.isEmpty()||nums[st.peek()]>nums[i])
        		st.push(i);
        }
        for(int i=nums.length-1;i>=0;i--) {
        	while(!st.empty() && nums[i]>=nums[st.peek()]) {
        		ans=Math.max(ans, i-st.peek());
        		st.pop();
        	}
        }
        return ans;
    }
}
