package Array;

public class SingleNumber136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {2,2,1};
System.out.println(singleno(nums));
	}
	public static int singleno(int nums[]) {
		int ans=0;
		for(int i=0;i<nums.length;i++) {
			ans^=nums[i];
		}
		return ans;
	}
	

}
