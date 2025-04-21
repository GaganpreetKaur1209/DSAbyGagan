package Array;

import java.util.Arrays;

public class SortColours75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int nums[]= {2,0,2,1,1,0};
int nums[]= {2,0,1};
System.out.println(Arrays.toString(sortColors(nums)));
	}
public static int[] sortColors(int[] nums) {
     int i=0, j=0, k=nums.length-1;
    while(i<=k) {
    	 if(nums[i]==1)
    		 i++;
    	 else if(nums[i]==0) {
    		 int temp=nums[i];
    		 nums[i]=nums[j];
    		 nums[j]=temp;
    		 j++;
    		 i++;
    	 }
    	 else {
    		 int temp=nums[i];
    		 nums[i]=nums[k];
    		 nums[k]=temp;
    		 k--;
    	 }
     }
    return nums;
    }
}
