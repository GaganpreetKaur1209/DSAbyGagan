package Array;

public class MissingNumberII268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,0,1};
System.out.println(missingno(nums));
	}
public static int missingno(int nums[]) {
	int ans=0;	
	for(int i=0;i<nums.length;i++) {
		ans+=nums[i];
	}
	int n=(nums.length*(nums.length+1))/2;
	return n-ans;
}
}
