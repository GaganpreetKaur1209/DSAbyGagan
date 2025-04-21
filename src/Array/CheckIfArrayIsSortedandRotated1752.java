package Array;

public class CheckIfArrayIsSortedandRotated1752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {2,1,3,4};
System.out.println(rotatedandsorted(nums));
	}
	public static boolean rotatedandsorted(int nums[]) {
		int c=0;
		while(c<nums.length) {
		boolean sort=sorted(nums);
			if(sort==false) {
				rotate(nums);
			}
			else
				return true;
		
		c++;
		}
		return false;
		
	}
public static boolean sorted(int nums[]) {
	for(int i=0;i<nums.length-1;i++) {
		if(nums[i]>nums[i+1])
			return false;
		
	}
	return true;
}
public static void rotate(int nums[]) {
	int last=nums[0];
	int temp[]=new int[nums.length];
	for(int i=0;i<nums.length-1;i++) {
		temp[i]=nums[i+1];
	}
	temp[nums.length-1]=last;
	for(int i=0;i<nums.length;i++) {
		nums[i]=temp[i];
	}
}
}
