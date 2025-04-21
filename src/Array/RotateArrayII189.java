package Array;

public class RotateArrayII189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7};
int k=3;
rotate(arr,k);
for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");
}
	}
	 public static void rotate(int[] nums, int k) {
		 k=k%nums.length;
		 int temp[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	temp[(i+k)%nums.length]=nums[i];
	        }
	        for(int i=0;i<nums.length;i++) {
	        	nums[i]=temp[i];
	        }
	    }

}
