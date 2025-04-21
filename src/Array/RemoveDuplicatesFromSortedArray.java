package Array;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,1,2};
System.out.println(removeDuplicates(nums));
	}
public static int removeDuplicates(int[] nums) {
	int c=1;
	//nums[0]=nums[0];
	
    for(int i=1;i<nums.length;i++) {
    	if(nums[i-1]!=nums[i]) {
    		nums[c]=nums[i];
    		c++;
    		
    	}
    		
   
    }
    return c;
    }

}
