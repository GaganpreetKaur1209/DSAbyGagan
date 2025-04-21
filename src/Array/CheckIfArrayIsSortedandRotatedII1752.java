package Array;

public class CheckIfArrayIsSortedandRotatedII1752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,4,5,1,2};
System.out.println(rotatedandsorted(nums));
	}
	public static boolean rotatedandsorted(int nums[]) {
		int c=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>nums[(i+1)%nums.length])
				c++;
			if(c>1)
				return false;
		}
		return true;
}
}
