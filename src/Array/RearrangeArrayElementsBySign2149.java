package Array;

import java.util.Arrays;

public class RearrangeArrayElementsBySign2149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,1,2,-2,-5,2,-4};
System.out.println(Arrays.toString(rearrangeArray(arr)));
	}
public static int[] rearrangeArray(int[] nums) {
        int i=0,j=1,k=0;
        int arr[]=new int[nums.length];
        while(k<nums.length) {
        	if(nums[k]>0) {
        		arr[i]=nums[k];
        		i=i+2;
        		k++;
        		}
        	else {
        		arr[j]=nums[k];
        	j=j+2;
        	k++;
        	}
        	
        }
        return arr;
    }

}
