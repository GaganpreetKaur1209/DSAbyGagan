package Array;

public class MissingNumber268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,0,1};
System.out.println(missingno(nums));
	}
public static int missingno(int nums[]) {
	int ans=0;
//	for(int i=0;i<nums.length;i++) {
//			ans^=nums[i];
//	}
//	for(int i=1;i<=nums.length;i++) {
//		ans^=i;
//	}
	for(int i=1;i<=nums.length;i++) {
		ans^=nums[i-1]^i;
	}
	return ans;
}
}
